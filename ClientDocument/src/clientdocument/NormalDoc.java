/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientdocument;
import java.io.*;

/**
 *
 * @author LENOVO
 */
public class NormalDoc implements Document {
    private String Extension;
    private String Encryption;

    @Override
    public void SetExtension() {
        this.Extension = ".txt"; 
    }

    @Override
    public void SetEncryption() {
        this.Encryption = "None"; 
    }

    @Override
    public void SaveToFile(String content) throws Exception {
        String fileName = "document" + Extension;
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Saved Normal Document: " + fileName);
        }
    }
    
}
