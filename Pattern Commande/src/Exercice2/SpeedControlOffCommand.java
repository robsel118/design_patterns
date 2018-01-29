package Exercice2;


public class SpeedControlOffCommand implements Command {
	
	SpeedControl speedControl;
	
	public SpeedControlOffCommand(SpeedControl speedControl) {
		this.speedControl = speedControl;
	}

	public void execute() {
		speedControl.off();
	}
	
	public void store() {
		Log.writeLog("--> " + this.getClass().getName());
	}
}

