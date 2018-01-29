package Exercice2;


public class LongLightsOffCommand implements Command {
	/**
	 * @uml.property  name="longLights"
	 * @uml.associationEnd  
	 */
	LongLights longLights;
	
	public LongLightsOffCommand(LongLights longLights) {
		this.longLights = longLights;
	}

	public void execute() {
		longLights.off();
	}
	
	public void store() {
		Log.writeLog("--> " + this.getClass().getName());
	}
}

