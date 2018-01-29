package Exercice1;


/**
 * @author  h40003073
 */
public class RightCommand implements Command {

	/**
	 * @uml.property  name="car"
	 * @uml.associationEnd  
	 */
	private Car car;
	
	public RightCommand(Car car) {
		this.car = car;
	}
	
	public void execute() {
		car.right();
	}

	public void undo() {
		car.left();
	}

}
