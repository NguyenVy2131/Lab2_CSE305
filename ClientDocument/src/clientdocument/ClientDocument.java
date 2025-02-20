/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientdocument;

/**
 *
 * @author LENOVO
 */
public class ClientDocument {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Document normalDoc = new NormalDoc();
            normalDoc.SetExtension();
            normalDoc.SetEncryption();
            normalDoc.SaveToFile("This is a normal document.");

            Document confidentialDoc = new ConfidentialDoc();
            confidentialDoc.SetExtension();
            confidentialDoc.SetEncryption();
            confidentialDoc.SaveToFile("This is a confidential document.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
