package Exercice2;


public class RightIndicatorOnCommand implements Command {
	
	RightIndicator rightIndicator;

	public RightIndicatorOnCommand(RightIndicator rightIndicator) {
		this.rightIndicator = rightIndicator;
	}

	public void execute() {
		rightIndicator.on();
	}
	
	public void store() {
		Log.writeLog("--> " + this.getClass().getName());
	}
}
