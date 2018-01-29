package Exercice2;


public class RightIndicatorOffCommand implements Command {
	
	RightIndicator rightIndicator;
	
	public RightIndicatorOffCommand(RightIndicator rightIndicator) {
		this.rightIndicator = rightIndicator;
	}

	public void execute() {
		rightIndicator.off();
	}
	
	public void store() {
		Log.writeLog("--> " + this.getClass().getName());
	}
}

