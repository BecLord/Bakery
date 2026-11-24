import java.util.Scanner;

public class MyMain {
    public static void main(String[] input) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum items per order: ");
        int maxItemsPerOrder = sc.nextInt();
        sc.nextLine();  
        Bakery bakery = new BakeryImp(maxItemsPerOrder);
        
        boolean running = true;
        while (running) {
            System.out.println("1. Add Cake");
            System.out.println("2. Add Pastry");
            System.out.println("3. Add Bread");
            System.out.println("4. View Items");
            System.out.println("5. Create Order");
            System.out.println("6. Exit");
            
            int choice = sc.nextInt();
            sc.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter cake name: ");
                    String cakeName = sc.nextLine();
                    System.out.print("Enter flavour: ");
                    String cakeFlavour = sc.nextLine();
                    System.out.print("Enter price: ");
                    double cakePrice = sc.nextDouble();
                    bakery.addCake(cakeName, cakeFlavour, cakePrice);
                    break;
                case 2:
                    System.out.print("Enter pastry name: ");
                    String pastryName = sc.nextLine();
                    System.out.print("Enter filling: ");
                    String pastryFilling = sc.nextLine();
                    System.out.print("Enter price: ");
                    double pastryPrice = sc.nextDouble();
                    bakery.addPastry(pastryName, pastryFilling, pastryPrice);
                    break;
                case 3:
                    System.out.print("Enter bread name: ");
                    String breadName = sc.nextLine();
                    System.out.print("Enter type: ");
                    String breadType = sc.nextLine();
                    System.out.print("Enter price: ");
                    double breadPrice = sc.nextDouble();
                    bakery.addBread(breadName, breadType, breadPrice);
                    break;
                case 4:
                    bakery.displayAllItemIDs();
                    break;
                case 5:
                    System.out.print("Enter customer ID: ");
                    int customerID = sc.nextInt();
                    System.out.print("Enter item ID: ");
                    int itemID = sc.nextInt();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    bakery.createOrder(customerID, itemID, quantity);
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid option, try again.");
                    break;
            }
        }
        sc.close();
    }
}
