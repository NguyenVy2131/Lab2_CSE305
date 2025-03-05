import java.util.*;
import java.util.ArrayList;

class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Location {
    private String address;

    public Location(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}


class Property {
    private String name;
    private double rentAmount;
    private Owner owner; 
    private Location location;

    public Property(String name, double rentAmount, Owner owner, Location location) { // Constructor with a data clump
        this.name = name;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public Owner getOwner() {
        return owner;
    }

    public Location getLocation() {
        return location;
    }

    public double calculateYearlyRent() {
        return rentAmount * 12;
    }

    public String getPropertyType() {
        return rentAmount > FinancialReport.PREMIUM_RENT_THRESHOLD ? "This is a premium property." : "This is a standard property.";
    }

    public void printPropertyDetails() {
        System.out.println("Property: " + name);
        System.out.println("Rent Amount: $" + rentAmount);
        System.out.println("Owner: " + owner.getName());
        System.out.println("Location: " + location.getAddress());
    }
}

class FinancialReport {
    public static final double PREMIUM_RENT_THRESHOLD = 2000;
    private String reportTitle;
    private List<Property> properties;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public void generateReport() {
        double totalRent = 0; 
        System.out.println("Financial Report: " + reportTitle);
        System.out.println("----------------------------");

        for (Property property : properties) {
            property.printPropertyDetails();
            totalRent += property.getRentAmount();

            System.out.println(property.getPropertyType());
            System.out.println("Yearly Rent: $%.2f" + property.calculateYearlyRent());
            System.out.println("--------------------");
        }

        System.out.println("Total Rent Amount: $%.2f" + totalRent);
        
    }
}

public class ReportGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Property> properties = new ArrayList<>();

        System.out.print("Enter report title: ");
        String reportTitle = scanner.nextLine();

        System.out.print("Enter the number of properties: ");
        int numProperties = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numProperties; i++) {
            System.out.println("\nEntering details for property " + (i + 1) + ":");
            System.out.print("Property Name: ");
            String propertyName = scanner.nextLine();

            System.out.print("Rent Amount: ");
            double rentAmount = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Owner Name: ");
            String ownerName = scanner.nextLine();
            Owner owner = new Owner(ownerName);

            System.out.print("Location Address: ");
            String locationAddress = scanner.nextLine();
            Location location = new Location(locationAddress);

            properties.add(new Property(propertyName, rentAmount, owner, location));
        }

        FinancialReport financialReport = new FinancialReport(reportTitle, properties);
        financialReport.generateReport();

        scanner.close();
    }
}