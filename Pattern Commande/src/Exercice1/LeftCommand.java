package Exercice1;


/**
 * @author  h40003073
 */
public class LeftCommand implements Command {

	/**
	 * @uml.property  name="car"
	 * @uml.associationEnd  
	 */
	private Car car;
	
	public LeftCommand(Car car) {
		this.car = car;
	}

	public void execute() {
		car.left();
	}

	public void undo() {
		car.right();
	}

}

