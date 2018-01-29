package Exercice1;


/**
 * @author  h40003073
 */
public class CarBreak extends Car {
    
    
    /**
	 * @uml.property  name="sECURITY_LEVEL"
	 */
    protected static final int SECURITY_LEVEL = 50;
    protected static final int PRICE = 30000;
    
    public CarBreak() {
        this.description = "Break";
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

