package project;
import java.util.ArrayList;
import java.util.Scanner;

public class addvendor {
    private static ArrayList<Vendor> vendors = new ArrayList<>();

    public static void addven(Scanner sc) {
        System.out.print("Enter vendor name: ");
        String name = sc.nextLine();
        System.out.print("Enter vendor password: ");
        String password = sc.nextLine();
        System.out.print("Enter vendor email: ");
        String email = sc.nextLine();

        Vendor vendor = new Vendor(name, password, email);
        vendors.add(vendor);

        System.out.println("Vendor added successfully.");
    }

    public static void viewVendors() {
        System.out.println("Vendors:");
        System.out.println("-----------------------");
        if (vendors.isEmpty()) {
            System.out.println("No vendors found.");
        } else {
            for (Vendor vendor : vendors) {
                System.out.println("Name: " + vendor.getName() + ", Email: " + vendor.getEmail());
            }
        }
        System.out.println("-----------------------");
    }
    public static void vendorLogin(Scanner sc) {
        System.out.print("Enter vendor email: ");
        String email = sc.nextLine();
        System.out.print("Enter vendor password: ");
        String password = sc.nextLine();

        for (Vendor vendor : vendors) {
            if (vendor.authenticate(email, password)) {
                System.out.println("Login successful. Welcome, " + vendor.getName() + "!");
                AddProduct as=new AddProduct();
                while (true) {
                    System.out.println("Select an option:");
                    System.out.println("1. Add Product");
                    System.out.println("2. View Products");
                    System.out.println("3. Exit");
                    System.out.print("Enter your choice: ");
                    int choice = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    
                    switch (choice) {
                        case 1:
                           as.addProduct(sc);
                            break;
                        case 2:
                           as.viewProducts();
                            break;
                        case 3:
                            System.out.println("Exiting...");
                            return;
                        default:
                            System.out.println("Invalid input. Please select 1, 2, or 3.");
                            break;
                    }
                }
            }
        }
        System.out.println("Invalid email or password. Please try again.");
    }

    public static ArrayList<Vendor> getVendors() {
        return vendors;
    }
    
}
