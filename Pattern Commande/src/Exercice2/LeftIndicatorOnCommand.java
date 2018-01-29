package Exercice2;


public class LeftIndicatorOnCommand implements Command {
	/**
	 * @uml.property  name="leftIndicator"
	 * @uml.associationEnd  
	 */
	LeftIndicator leftIndicator;

	public LeftIndicatorOnCommand(LeftIndicator leftIndicator) {
		this.leftIndicator = leftIndicator;
	}

	public void execute() {
		leftIndicator.on();
	}
	
	public void store() {
		Log.writeLog("--> " + this.getClass().getName());
	}
}
