package Exercice1;

import java.util.ArrayList;


/**
 * @author  h40003073
 */
public abstract class Wall {
    protected String name;
    
    /**
	 * @uml.property  name="price"
	 */
    protected int price;
    private ArrayList<Wall> neighbours = new ArrayList<Wall>();;

    
    public void bindTo(Wall w) {
        neighbours.add(w);
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
