package Exercice1;


/**
 * @author  h40003073
 */
abstract public class Car
{
	
	/**
	 * @uml.property  name="name"
	 */
	protected String name;
    
    /**
	 * @uml.property  name="color"
	 */
    private String color;

	
	/**
	 * @return
	 * @uml.property  name="name"
	 */
	public String getName() {
		return name;
	}

    
    /**
	 * @return
	 * @uml.property  name="color"
	 */
    public String getColor() {
        return color;
    }

    public void installEngine() {
        System.out.println("Car " + name + " : Engine is installed.");
    }

    public void addExtras() {
        System.out.println("Car " + name + " : Extras are added");
    }
    
    public void paint(String color) {
        this.color = color;
        System.out.println("Car " + name + " : car is painted in color " + color);
    }

    @Override
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		return display.toString();
	}

}

