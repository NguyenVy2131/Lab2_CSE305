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

    public User(String UserID, String Password, String Email) {
        this.UserID = UserID;
        this.Password = Password;
        this.Email = Email;
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
    public static User createUser(String username, String password, String email) {
        return new User(username, password, email);
    }

    public void resetPassword(String newPassword) {
        this.Password = newPassword;
    }

    @Override
    public String toString() {
        return "User{" +
               "username='" + UserID + '\'' +
               ", email='" + Email + '\'' +
               '}';
    }
}
