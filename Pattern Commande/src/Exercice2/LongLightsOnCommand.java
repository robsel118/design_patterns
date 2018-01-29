package Exercice2;


public class LongLightsOnCommand implements Command {
	
	LongLights longLights;

	public LongLightsOnCommand(LongLights longLights) {
		this.longLights = longLights;
	}

	public void execute() {
		longLights.on();
	}
	
	public void store() {
		Log.writeLog("--> " + this.getClass().getName());
	}
}
