/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;

/**
 *
 * @author LENOVO
 */
public class Property {
    private String PropertyID;
    private String Discription;
    private String PropertyOwnerID;

    public Property(String PropertyID, String Discription, String PropertyOwnerID) {
        this.PropertyID = PropertyID;
        this.Discription = Discription;
        this.PropertyOwnerID = PropertyOwnerID;
    }

    public String getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(String PropertyID) {
        this.PropertyID = PropertyID;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String Discription) {
        this.Discription = Discription;
    }

    public String getPropertyOwnerID() {
        return PropertyOwnerID;
    }

    public void setPropertyOwnerID(String PropertyOwnerID) {
        this.PropertyOwnerID = PropertyOwnerID;
    }
}
