package Exercice2;


public class LeftIndicatorOffCommand implements Command {
	
	LeftIndicator leftIndicator;
	
	public LeftIndicatorOffCommand(LeftIndicator leftIndicator) {
		this.leftIndicator = leftIndicator;
	}

	public void execute() {
		leftIndicator.off();
	}
	
	public void store() {
		Log.writeLog("--> " + this.getClass().getName());
	}
}
