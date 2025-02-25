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
public class MidPriorityConcrete extends RequestProduct{

    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }


    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated completion date is " + getExpireDateString());
    }

    @Override
    public void setExpireDate() {
        this.expireDate = LocalDate.now().plusMonths(1);
    }
    
}
