package Exercice2;


public class SpeedControlOnCommand implements Command {
	
	SpeedControl speedControl;

	public SpeedControlOnCommand(SpeedControl speedControl) {
		this.speedControl = speedControl;
	}

	public void execute() {
		speedControl.on();
	}
	
	public void store() {
		Log.writeLog("--> " + this.getClass().getName());
	}
}

