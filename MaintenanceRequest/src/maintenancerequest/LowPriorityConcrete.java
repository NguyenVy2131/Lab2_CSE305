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
public class LowPriorityConcrete extends RequestProduct {

    @Override
    public void setPriority() {
        this.priority = "Ignore";
    }

    @Override
    public void setStatus() {
        this.status = "Done";
    }
    
    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }

    @Override
    public void setExpireDate() {
        this.expireDate = LocalDate.now();
    }
    
}
