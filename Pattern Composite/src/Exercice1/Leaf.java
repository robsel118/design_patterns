package Exercice1;


import java.util.ArrayList;


/**
 * @author  h40003073
 */
public class Leaf extends Component {
    //Attributes

   
    /**
	 * @uml.property  name="name"
	 */
    private String name;

    //Constructor
    public Leaf(String n) {
        name = n;
    }

    
    /**
	 * @return
	 * @uml.property  name="name"
	 */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Leaf " + name;
    }

    @Override
    public ArrayList<Component> getChildren() {
        return new ArrayList<Component>();
    }
}
