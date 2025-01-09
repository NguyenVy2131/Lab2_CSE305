/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;

/**
 *
 * @author LENOVO
 */
public class User {
    private String UserID;
    private String Password;
    private String Email;
    private String UserType;

    public User(String UserID, String Password, String Email, String UserType) {
        this.UserID = UserID;
        this.Password = Password;
        this.Email = Email;
        this.UserType = UserType;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }
}
