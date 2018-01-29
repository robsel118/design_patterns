package Exercice2;


public class BrakesOffCommand implements Command {
	
	Brakes brakes;
	
	public BrakesOffCommand(Brakes brakes) {
		this.brakes = brakes;
	}

	public void execute() {
		brakes.off();
	}
	
	public void store() {
		Log.writeLog("--> " + this.getClass().getName());
	}
}
