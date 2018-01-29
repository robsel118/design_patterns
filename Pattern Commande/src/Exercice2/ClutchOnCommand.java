package Exercice2;


public class ClutchOnCommand implements Command {
	
	Clutch clutch;

	public ClutchOnCommand(Clutch clutch) {
		this.clutch = clutch;
	}

	public void execute() {
		clutch.on();
		clutch.changeGear(2);
	}
	
	public void store() {
		Log.writeLog("--> " + this.getClass().getName());
	}
}

