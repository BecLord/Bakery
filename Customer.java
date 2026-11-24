//Imports
import java.util.ArrayList;
//Class Customer - models a customer of the bakery
public class Customer extends Agent 
{
    //Fields
    private final String name; //Name of customer
    private boolean hasUnpaidOrder; //customer has unpaid order
    private final ArrayList<Order> activeOrders; //Lst of ordrs placed by customer
    private final int maxOrders; //maximum orders a customer can place at one.

    //Constructor
    public Customer(int _id, String name, int maxOrders) {
        super(_id); 
        this.name = name;
        this.maxOrders = maxOrders;
        this.hasUnpaidOrder = false;
        this.activeOrders = new ArrayList<Order>(); //Start with an empty order
    }

    //Get Methods
    public boolean getHasUnpaidOrder() {
        return this.hasUnpaidOrder; 
    }

    public ArrayList<Order> getActiveOrders(){
        return this.activeOrders;
    }

    public int getMaxOrders() {
        return this.maxOrders;
    }

    //Set Methods
    public void setHasUnpaidOrder(boolean hasUnpaidOrder) {
        this.hasUnpaidOrder = hasUnpaidOrder;
    }

    //Extra Methods
    public String toString() {
        return "Customer ID: " + this.getId() + ", Name: " + this.name + ", Unpaid Order: " + this.hasUnpaidOrder + ", Max Orders: " + this.maxOrders;
    }
    
    public boolean placeOrder(Order order) {
        if (this.activeOrders.size() < this.maxOrders) {
            this.activeOrders.add(order);
            return true; 
        }
        return false;
    }
}
