package Exercice2;



public class Registered implements State {

	private Person person;
	
	public Registered(Person person) {
		this.person = person;
	}
	
	public State ask() {
		return this;
	}

	public State enter() {
		System.out.println("enter");
		return person.getInMeetingState();
	}

	public State handover() {
		return this;
	}

	public State leave() {
		return this;
	}

	public State over() {
		return this;
	}

}

