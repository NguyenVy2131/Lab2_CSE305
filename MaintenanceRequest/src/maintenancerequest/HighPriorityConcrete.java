/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maintenancerequest;
import java.time.LocalDate;

/**
 *
 * @author LENOVO
 */
public class HighPriorityConcrete extends RequestProduct{

    @Override
    public void setPriority() {
        this.priority = "Emergency";
    }

    @Override
    public void setStatus() {
        this.status = "Accept";
    }

    

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }

    @Override
    public void setExpireDate() {
        this.expireDate = LocalDate.now();
    }
    
}
