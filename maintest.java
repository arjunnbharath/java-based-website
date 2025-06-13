package project;
import java.util.Scanner;

public class maintest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------------");
        System.out.println("-WELCOME TO ASTRO-");
        System.out.println("------------------");
        
        while (true) {
            System.out.println("Select 1/2/3/4");
            System.out.println("1.ADMIN");
            System.out.println("2.CUSTOMER");
            System.out.println("3.VENDOR");
            System.out.println("4.Delivery Partner");
            System.out.println("5.EXIT");
            int userInput = sc.nextInt();
            sc.nextLine(); 
            
            switch (userInput) {
                case 1:
                    if (authenticateAdmin(sc)) {
                        adminMenu(sc);
                    } else {
                        System.out.println("Admin login failed. Invalid credentials.");
                    }
                    break;
                case 2:
                    customerMenu(sc);
                    break;
                case 3:
                    vendorMenu(sc);
                    break;
                case 4:
                    System.out.println("Enter your name: ");
                    String dvname = sc.nextLine();
                    System.out.println("Enter your location: ");
                    String dvloc = sc.nextLine();
                    
                    // Create an instance of delivery with the entered name and location
                    delivery deliveryPartner = new delivery(dvname, dvloc);
                    System.out.println("Delivery partner added successfully!");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input. Please select 1, 2, 3, or 4.");
                    break;
            }
        }
    }

    private static boolean authenticateAdmin(Scanner sc) {
        String ADMIN_USERNAME = "arjun";
        String ADMIN_PASSWORD = "123";
        
        System.out.print("Enter admin username: ");
        String username = sc.nextLine();
        System.out.print("Enter admin password: ");
        String password = sc.nextLine();
        
        return username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD);
    }

 
    private static void customerMenu(Scanner sc) {
    	AddProduct as=new AddProduct();
        while (true) {
            System.out.println("Customer Menu:");
            System.out.println("1. Register");
            System.out.println("2. Login");
             
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                	addcustomer add=new addcustomer();
                	add.addcus(sc);
                    break;
                case 2:
                  addcustomer.customerLogin(sc);
                    break;

                case 3:
                    System.out.println("Exiting Customer Menu...");
                    return;
                default:
                    System.out.println("Invalid input. Please select a valid option.");
                    break;
            }
        }
    }


    private static void vendorMenu(Scanner sc) {
    	
    	AddProduct as=new AddProduct();
        while (true) {
            System.out.println("Vendor Menu:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                	addvendor addv=new addvendor();
                	addv.addven(sc);
                    break;
                case 2:
                	addvendor.vendorLogin(sc);
                	
                    break;
             
           
                case 3:
                    System.out.println("Exiting Vendor Menu...");
                    return;
                default:
                    System.out.println("Invalid input. Please select a valid option.");
                    break;
            }
        }
    }

    private static void adminMenu(Scanner sc) {
    	addcustomer add=new addcustomer();
    	addvendor addv=new addvendor();
    	
        while (true) {
            System.out.println("Admin Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Vendor");
            System.out.println("3. View Customer");
            System.out.println("4. View Vendor");
            System.out.println("5. Save as Text file");
            System.out.println("6. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); 
            
            switch (choice) {
                case 1:
                	
                    add.addcus(sc);
                    break;
                case 2:
                    
                    addv.addven(sc);
                    break;
                case 3 :
                	add.viewCustomers();
                   
                	break;
                case 4 :
                	addv.viewVendors();
                	break;
                case 5 :
                	DataFileManager.printAndSaveData();
                	break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid input. Please select 1, 2, or 3.");
                    break;
            }
        }
    }
public void vendoradd() {
	
}

}
