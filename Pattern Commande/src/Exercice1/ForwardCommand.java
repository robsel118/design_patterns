package Exercice1;


/**
 * @author  h40003073
 */
public class ForwardCommand implements Command {

	/**
	 * @uml.property  name="car"
	 * @uml.associationEnd  
	 */
	private Car car;
	
	public ForwardCommand(Car car) {
		this.car = car;
	}

	public void execute() {
		car.forward();
	}

	public void undo() {
		car.backward();
	}

}
