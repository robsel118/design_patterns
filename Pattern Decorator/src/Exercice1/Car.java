package Exercice1;

/**
 * @author  h40003073
 */
public abstract class Car {
    
    
    /**
	 * @uml.property  name="description"
	 */
    protected String description = "";
    
    public Car() {
    }
    
    
    /**
	 * @return
	 * @uml.property  name="description"
	 */
    public String getDescription() {
        return this.description;
    }
    
    public abstract int getCost();
    
    public abstract int getSecurityLevel();
}
