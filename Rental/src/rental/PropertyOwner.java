/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;
import java.util.*;
/**
 *
 * @author LENOVO
 */
public class PropertyOwner {
    private User user;
    private List<Property> listOfProperties;

    public PropertyOwner(User user) {
        this.user = user;
        this.listOfProperties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        listOfProperties.add(property);
        System.out.println("Property added successfully!");
    }

    public void removeProperty(Property property) {
        listOfProperties.remove(property);
        System.out.println("Property removed successfully!");
    }
}
