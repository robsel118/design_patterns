package Exercice2;



public class DigitalTimer implements Observer {
	private int hour;
	private int minute;
	private int second;
	
	private Subject clockTimer;
	
	public DigitalTimer(Subject clockTimer) {
		this.clockTimer = clockTimer;
		clockTimer.registerObserver(this);
	}
	
	public void update(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		display();
	}
	
	private void display() {
		System.out.println("DIGITAL CLOCK: Hour : " + hour + " / Min : " + minute + " / Sec : " + second);
	}
}

