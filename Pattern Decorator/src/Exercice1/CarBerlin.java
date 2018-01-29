package Exercice1;


/**
 * @author  h40003073
 */
public class CarBerlin extends Car {
    
   
    /**
	 * @uml.property  name="sECURITY_LEVEL"
	 */
    protected static final int SECURITY_LEVEL = 40;
    protected static final int PRICE = 40000;
    
    public CarBerlin() {
        this.description = "Berlin";
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

