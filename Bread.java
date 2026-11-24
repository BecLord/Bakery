//Class Bread - models a bread item in the bakery
public class Bread extends Item {
    //Fields
    private final String type; 

    //Constructor
    public Bread(int _id, String name, double price, String type) {
        super(_id, name, "Bread", price); 
        this.type = type;
    }

    //Get Methods
    public String getType() {
        return this.type;
    }

    public String toString() {
        return super.toString() + ", Type: " + this.getType();
    }
}
