//Interface for managing bakery
public interface Bakery {
    //Add Cake
    int addCake(String name, String flavour, double price);
    
    //Add Pastry
    int addPastry(String name, String filling, double price);
    
    //Add Bread
    int addBread(String name, String type, double price);
    
    //Remove Item
    boolean removeItem(int itemID);
    
    //Display item Info
    void displayItemInfo(int itemID);
    
    //Display all Items
    void displayAllItemIDs();
    
    //Create Order
    int createOrder(int customerID, int itemID, int quantity);
    
    //Display Order
    void displayOrderInfo(int orderID);
    
    //Remove Order
    boolean removeOrder(int orderID);
}






