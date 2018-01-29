package Exercice1;

/**
 * @author  h40003073
 */
public class CarSport extends Car {
    
    
    /**
	 * @uml.property  name="sECURITY_LEVEL"
	 */
    protected static final int SECURITY_LEVEL = 30;
    protected static final int PRICE = 35000;
    
    public CarSport() {
        this.description = "Sport";
    }

    public int getCost() {
        return PRICE;
    }

    
    /**
	 * @return
	 * @uml.property  name="sECURITY_LEVEL"
	 */
    public int getSecurityLevel() {
        return SECURITY_LEVEL;
    }
    
}
