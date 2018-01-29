package Exercice1;



import java.util.ArrayList;

/**
 * @author  h40003073
 */
public class Composite extends Component {

    
    /**
	 * @uml.property  name="name"
	 */
    private String name;
    
    /**
	 * @uml.property  name="children"
	 */
    private ArrayList<Component> children;

    public Composite(String n) {
        name = n;
        children = new ArrayList<Component>();
    }

    /**
	 * @param n
	 * @uml.property  name="name"
	 */
    public void setName(String n) {
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
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return (Component) children.get(i);
    }

    
    /**
	 * @return
	 * @uml.property  name="children"
	 */
    @Override
    public ArrayList<Component> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        String temp = "Composite " + name;
        for (Component n : this.children) {
            temp = temp + n.toString();
        }
        return temp;
    }
}

