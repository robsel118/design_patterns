package Exercice2;


public class ShortLightsOnCommand implements Command {
	
	ShortLights shortLights;

	public ShortLightsOnCommand(ShortLights shortLights) {
		this.shortLights = shortLights;
	}

	public void execute() {
		shortLights.on();
	}
	
	public void store() {
		Log.writeLog("--> " + this.getClass().getName());
	}
}

