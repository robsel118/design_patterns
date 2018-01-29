package Exercice1;

/**
 * @author  h40003073
 */
public class BackwardCommand implements Command {

	/**
	 * @uml.property  name="car"
	 * @uml.associationEnd  
	 */
	private Car car;
	
	public BackwardCommand(Car car) {
		this.car = car;
	}

	public void execute() {
		car.backward();
	}

	public void undo() {
		car.forward();
	}

}

