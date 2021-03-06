package Exercice1;


/**
 * @author  h40003073
 */
public abstract class Door {

    protected String name;
   
    /**
	 * @uml.property  name="price"
	 */
    protected int price;
    
    /**
	 * @uml.property  name="wall"
	 * @uml.associationEnd  
	 */
    private Wall wall;

    public void buildOnWall(Wall wall) {
        this.wall = wall;
    }
    
    /**
	 * @return
	 * @uml.property  name="price"
	 */
    public int getPrice() {
        return price;
    }

   
    /**
	 * @param price
	 * @uml.property  name="price"
	 */
    public void setPrice(int price) {
        this.price = price;
    }

}

