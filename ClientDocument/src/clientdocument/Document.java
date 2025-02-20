/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clientdocument;

/**
 *
 * @author LENOVO
 */
public interface Document {
    public void SetExtension();
    public void SetEncryption();
    public void SaveToFile(String content) throws Exception;
}
