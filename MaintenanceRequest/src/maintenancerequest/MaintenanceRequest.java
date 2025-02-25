/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maintenancerequest;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class MaintenanceRequest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RequestCreator requestCreator = null;

        while (true) {
            System.out.println("=== Maintenance Request Menu ===");
            System.out.println("1. Create Low-Priority Request");
            System.out.println("2. Create Mid-Priority Request");
            System.out.println("3. Create High-Priority Request");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    requestCreator = new LowPriorityConcreteCreator();
                    requestCreator.process();
                    break;
                case "2":
                    requestCreator = new MidPriorityConcreteCreator();
                    requestCreator.process();
                    break;
                case "3":
                    requestCreator = new HighPriorityConcreteCreator();
                    requestCreator.process();
                    break;
                case "0":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println(); 
        }
    }
    
}
