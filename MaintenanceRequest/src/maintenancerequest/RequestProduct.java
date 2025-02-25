/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maintenancerequest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author LENOVO
 */
public abstract class RequestProduct {
    protected String priority;
    protected String status;
    protected LocalDate expireDate;
    
    public abstract void setPriority();
    public abstract void setStatus();
    public abstract void setExpireDate();
    public abstract void processRequest();

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }
    
    public String getExpireDateString() {
        if (expireDate == null) return "N/A";
        return expireDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    
    
}
