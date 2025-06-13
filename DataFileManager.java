package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataFileManager {

    public static void printAndSaveData() {
        printCustomerDetails();
        printVendorDetails();
        printProductDetails();
        saveDetailsToFile();
    }

    private static void printCustomerDetails() {
        ArrayList<Customer> customers = addcustomer.getCustomers();
        System.out.println("Customer Details:");
        for (Customer customer : customers) {
            System.out.println("Name: " + customer.getName() + ", Email: " + customer.getEmail() + ", UniqueID: " + customer.getEmail2());
        }
    }

    private static void printVendorDetails() {
        ArrayList<Vendor> vendors = addvendor.getVendors();
        System.out.println("Vendor Details:");
        for (Vendor vendor : vendors) {
            System.out.println("Name: " + vendor.getName() + ", Email: " + vendor.getEmail());
        }
    }

    private static void printProductDetails() {
        ArrayList<Product> products = AddProduct.getProducts();
        System.out.println("Product Details:");
        for (Product product : products) {
            System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice());
        }
    }

    private static void saveDetailsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ArjunBharathSR(G10XI\\Desktop\\Arjun\\New folder (2)\\output.txt"))) {
            writer.write("Customer Details:\n");
            for (Customer customer : addcustomer.getCustomers()) {
                writer.write("Name: " + customer.getName() + ", Email: " + customer.getEmail() + ", UniqueID: " + customer.getEmail2() + "\n");
            }
            writer.write("\nVendor Details:\n");
            for (Vendor vendor : addvendor.getVendors()) {
                writer.write("Name: " + vendor.getName() + ", Email: " + vendor.getEmail() + "\n");
            }
            writer.write("\nProduct Details:\n");
            for (Product product : AddProduct.getProducts()) {
                writer.write("Name: " + product.getName() + ", Price: " + product.getPrice() + "\n");
            }
            System.out.println("Details saved to details.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while saving details to file: " + e.getMessage());
        }
    }
}
