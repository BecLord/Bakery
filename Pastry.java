//Class Pastry - models a pastry item in the bakery
public class Pastry extends Item {
    //Fields
    private final String filling; 
    
    //Constructor
    public Pastry(int _id, String name, double price, String filling) {
        super(_id, name, "Pastry", price); 
        this.filling = filling;
    }
    
    //Get Methods
    public String getFilling() {
        return this.filling;
    }
    
    public String toString() {
        return super.toString() + ", Filling: " + this.getFilling();
    }
}