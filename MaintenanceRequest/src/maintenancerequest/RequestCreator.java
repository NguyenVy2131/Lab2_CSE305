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
public abstract class RequestCreator {
    public abstract RequestProduct createRequest();

    public void process() {
        RequestProduct request = createRequest();
        request.setPriority();
        request.setStatus();
        request.setExpireDate();
    
        request.processRequest();

        System.out.println("=== Request Summary ===");
        System.out.println("Priority: " + request.getPriority());
        System.out.println("Status: " + request.getStatus());
        System.out.println("Expire Day: " + request.getExpireDateString());
        System.out.println("=======================");
    }
}
