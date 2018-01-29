package Exercice2;

public class ShortLightsOffCommand implements Command {
	
	ShortLights shortLights;
	
	public ShortLightsOffCommand(ShortLights shortLights) {
		this.shortLights = shortLights;
	}

	public void execute() {
		shortLights.off();
	}
	
	public void store() {
		Log.writeLog("--> " + this.getClass().getName());
	}
}
