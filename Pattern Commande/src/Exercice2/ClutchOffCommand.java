package Exercice2;


public class ClutchOffCommand implements Command {
	/**
	 * @uml.property  name="clutch"
	 * @uml.associationEnd  
	 */
	Clutch clutch;
	
	public ClutchOffCommand(Clutch clutch) {
		this.clutch = clutch;
	}

	public void execute() {
		clutch.off();
	}
	
	public void store() {
		Log.writeLog("--> " + this.getClass().getName());
	}
}

