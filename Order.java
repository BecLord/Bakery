//Imports
import java.util.ArrayList;
//Class Order - models an order in the bakery
public class Order {
    //Fields
    private final int orderID; //order ID
    private final int customerID; //ID of customer for order
    private final ArrayList<Item> items; //list of items in order

    //Constructor
    public Order(int orderID, int customerID, ArrayList<Item> items) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.items = items;
    }

    //Get Methods
    public int getOrderID() {
        return this.orderID;
    }

    public int getCustomerID(){
        return this.customerID;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    //Extra Methods
    public String toString(){
        return "Order ID: " + this.orderID + ", Customer ID: " + this.customerID + ", Items: " + this.items;
    }

    public boolean isItemInorder(int itemID) {
        for (Item item : this.items) {
            if (item.getId() == itemID) {
                return true;
            }
        }
        return false;
    }
}
