//Imports
import java.util.ArrayList;
//Class Agent - Superclass, represents both customers and products in the bakery
public class Agent
{
    private final int id;
    
    //Constructor
    public Agent(int _id) {
        this.id = _id;
    }
    
    //Get Methods
    public final int getId() {
        return this.id;
    }
    
    //Equals
    public boolean equals(Agent o){
        return this.id == o.id;
    }
}
