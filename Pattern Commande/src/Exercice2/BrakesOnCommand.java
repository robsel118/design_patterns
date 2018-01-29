package Exercice2;


public class BrakesOnCommand implements Command {
	
	Brakes brakes;

	public BrakesOnCommand(Brakes brakes) {
		this.brakes = brakes;
	}

	public void execute() {
		brakes.on();
	}
	
	public void store() {
		Log.writeLog("--> " + this.getClass().getName());
	}
}
