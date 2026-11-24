//Class Cake - models a cake item in the bakery
public class Cake extends Item {
    //Fields
    private final String flavour; 
    
    //Constructor
    public Cake(int _id, String name, double price, String flavour) {
        super(_id, name, "Cake", price); 
        this.flavour = flavour;
    }
    
    //Get Methods
    public String getFlavour() {
        return this.flavour;
    }
    
    public String toString() {
        return super.toString() + ", Flabour: " + this.getFlavour();
    }
}