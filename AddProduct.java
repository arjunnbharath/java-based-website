package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class AddProduct {
    private static final int MAX_PRODUCTS = 5;
    private static int productCount = 0;
    private static ArrayList<Product> products = new ArrayList<>();

    public static void addProduct(Scanner sc) {
        if (productCount >= MAX_PRODUCTS) {
            System.out.println("You have already added the maximum number of products.");
            return;
        }

        System.out.println("Enter product details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        sc.nextLine(); 
        
        Product product = new Product(name, price);
        products.add(product);
        productCount++;
        System.out.println("Product added successfully.");
    }

    public static void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("No products added yet.");
        } else {
            System.out.println("Products:");
            for (Product product : products) {
                System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice());
            }
        }
    }

    public static void viewProductsAscendingPrice() {
        if (products.isEmpty()) {
            System.out.println("No products added yet.");
            return;
        }

        
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice));

        System.out.println("Products sorted in ascending order of price:");
        for (Product product : products) {
            System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice());
        }
    }
    public static void viewProductsAlphabetic() {
        if (products.isEmpty()) {
            System.out.println("No products added yet.");
            return;
        }

        
        Collections.sort(products, Comparator.comparing(Product::getName));

        System.out.println("Products sorted alphabetically:");
        for (Product product : products) {
            System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice());
        }
    }
    public static void purchaseProduct(Scanner sc) {
        System.out.println("Available Products:");
        viewProducts();
        
        System.out.print("Enter the index of the product you want to purchase: ");
        int index = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        if (index < 0 || index >= products.size()) {
            System.out.println("Invalid product index.");
            return;
        }
        
        Product selectedProduct = products.get(index);
        
        System.out.println("Product in Cart: " + selectedProduct.getName() + " for $" + selectedProduct.getPrice());
        System.out.println("");
        System.out.println("select payment methord");
        System.out.println("1.cash");
        System.out.println("2.Googlepay");
        int gg=sc.nextInt();
        switch (gg) {
        case 1:
        	System.out.println("Paying through Cash");
        	System.out.println("You have purchased: " + selectedProduct.getName() + " for $" + selectedProduct.getPrice());
        	
        	break;
        case 2:
        	System.out.println("Paying through Gpay");
        	System.out.println("You have purchased: " + selectedProduct.getName() + " for $" + selectedProduct.getPrice());
        	break;
        }
    }
    public static ArrayList<Product> getProducts() { 
        return products;
    }
}
