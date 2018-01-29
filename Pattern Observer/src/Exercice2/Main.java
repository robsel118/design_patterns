package Exercice2;


public class Main {


	public static void main(String[] args) {
		MyTimer clockTimer = new MyTimer();
		
		AnalogTimer analo = new AnalogTimer(clockTimer);
		DigitalTimer digit = new DigitalTimer(clockTimer);
	}
}