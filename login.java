package project;

import java.util.ArrayList;
import java.util.Scanner;

public class login {

    private static ArrayList<Vendor> vendors = new ArrayList<>();
    private static ArrayList<Customer> customers = new ArrayList<>();
    
    public static void vendorLogin(Scanner sc) {
        System.out.print("Enter vendor email: ");
        String email = sc.nextLine();
        System.out.print("Enter vendor password: ");
        String password = sc.nextLine();

        for (Vendor vendor : vendors) {
            if (vendor.getEmail().equals(email) && vendor.getPassword().equals(password)) {
                System.out.println("Login successful. Welcome, " + vendor.getName() + "!");
                return;
            }
        }
        System.out.println("Invalid email or password. Please try again.");
    }
   
    public static void customerLogin(Scanner sc) {
        System.out.print("Enter customer email: ");
        String email = sc.nextLine();
        System.out.print("Enter customer password: ");
        String password = sc.nextLine();

        for (Customer customer : customers) {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
                System.out.println("Login successful. Welcome, " + customer.getName() + "!");
                return;
            }
        }
        System.out.println("Invalid email or password. Please try again.");
    }

}
