/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientdocument;

import java.io.*;
import java.util.*;
import javax.crypto.*;

/**
 *
 * @author LENOVO
 */
public class ConfidentialDoc implements Document {
    private String Extension;
    private String Encryption;
    private SecretKey secretKey;

    @Override
    public void SetExtension() {
        this.Extension = ".zip";
    }

    @Override
    public void SetEncryption() {
        this.Encryption = "AES Encryption";
        try {
            this.secretKey = generateKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    private SecretKey generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        return keyGen.generateKey();
    }
    
    private String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
    
    @Override
    public void SaveToFile(String content) throws Exception {
        String encryptedContent = encrypt(content);
        try (FileOutputStream fos = new FileOutputStream("document" + Extension)) {
            fos.write(encryptedContent.getBytes());
            System.out.println("Saved Confidential Document: document" + Extension);
        }
    }
    
}
