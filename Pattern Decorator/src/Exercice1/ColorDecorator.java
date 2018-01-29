package Exercice1;

/**
 * @author  h40003073
 */
public class ColorDecorator extends OptionsDecorator {
    
   
    /**
	 * @uml.property  name="dESCRIPTION"
	 */
    protected static final String DESCRIPTION = "color of the car";
    
    /**
	 * @uml.property  name="sECURITY_LEVEL"
	 */
    protected static final int SECURITY_LEVEL = 0;
    protected static final int PRICE = 1340;
    
   
    /**
	 * @uml.property  name="car"
	 * @uml.associationEnd  
	 */
    private Car car = null;
    
    public ColorDecorator(Car car) {
        this.car = car;
    }

    
    /**
	 * @return
	 * @uml.property  name="dESCRIPTION"
	 */
    public String getDescription() {
        return this.car.getDescription() + ", " + DESCRIPTION;
    }

    public int getCost() {
        return this.car.getCost() + PRICE;
    }

    
    /**
	 * @return
	 * @uml.property  name="sECURITY_LEVEL"
	 */
    public int getSecurityLevel() {
        return this.car.getSecurityLevel() + SECURITY_LEVEL;
    }
    
}
