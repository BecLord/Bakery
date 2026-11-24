//Imports
import java.util.ArrayList;
//Abstract Class Item - models an item of the bakery
public abstract class Item extends Agent
{
    //Fields
    private final String name; //name of bakery item
    private final String type; //type of item 
    private final double price; //price
    private boolean isAvailable; //is it sold out?

    //Constructor
    public Item(int _id, String name, String type, double price) {
        super(_id);
        this.name = name;
        this.type = type;
        this.price = price;
        this.isAvailable = true; 
    }

    //Get Methods
    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    //Set Methods
    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable; 
    }

    //Extra Methods
    public double sellItem(){
        if (this.isAvailable) {
            this.isAvailable = false;
            return this.price;
        }
        else {
            return 0.0; 
        }
    }
    
    public static int isItemInItemsList(int id, ArrayList<Item> myList) {
        int res = -1; //create output variable
        Agent baseline = new Agent(id); //create agent from id
        int size = myList.size(); //search for item in list
        int index = 0;

        while ((res == -1) && (index < size)) {
            if (baseline.equals(myList.get(index)))
                res = index;
            else
                index++;
        }
        return res;
    }
}





