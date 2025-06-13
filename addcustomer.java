package project;

import java.util.ArrayList;
import java.util.Scanner;

public class addcustomer {
    private static ArrayList<Customer> customers = new ArrayList<>();
    private static int lastCustomerId = 001;
    public static void addcus(Scanner sc) {
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter customer password: ");
        String password = sc.nextLine();
        System.out.print("Enter customer email: ");
        String email = sc.nextLine();

        String customerId = generateUniqueId(name);

        Customer customer = new Customer(customerId,name, password, email);
        customers.add(customer); // Add the customer to the ArrayList

        System.out.println("Customer added successfully. Customer ID: " + customerId);
    }
    private static String generateUniqueId(String name) {
       
        lastCustomerId++;
        return name.replaceAll("\\s", "").toLowerCase() + lastCustomerId;
    }

    public static void viewCustomers() {
        System.out.println("Customers:");
        System.out.println("-----------------------");
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            for (Customer customer : customers) {
                System.out.println("Name: " + customer.getName() + ", Email: " + customer.getEmail()+ "UniqueID: " + customer.getEmail2());
            }
        }
        System.out.println("-----------------------");
    }
    public static void customerLogin(Scanner sc) {
        System.out.print("Enter customer email: ");
        String email = sc.nextLine();
        System.out.print("Enter customer password: ");
        String password = sc.nextLine();

        for (Customer customer : customers) {
            if (customer.authenticate(email, password)) {
                System.out.println("Login successful. Welcome, " + customer.getName() + "!");
                AddProduct as=new AddProduct();
                while(true) {
                System.out.println("select 1/2/3");
                System.out.println("1.view products in Alphebetic order");
                System.out.println("2.view in ascending order of price.");
               
                System.out.println("3.purchase");
                System.out.println("4.exit");
                int sinp=sc.nextInt();
                switch(sinp) {
                case 1:
                	as.viewProductsAlphabetic();
                	break;
                case 2:
                	as.viewProductsAscendingPrice();
                	break;
               
                case 3:
                	AddProduct.purchaseProduct(sc);
                	break;
                case 4:
                	System.out.println("exited");
                	return;
                }
                }
            }
        }
        System.out.println("Invalid email or password. Please try again.");
    }

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

}
