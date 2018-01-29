package Exercice2;



public class InMeeting implements State {

	private Person person;
	
	public InMeeting(Person person) {
		this.person = person;
	}
	
	public State ask() {
		return person.getWaitingToSpeakState();
	}

	public State enter() {
		return this;
	}

	public State handover() {
		return this;
	}

	public State leave() {
		System.out.println("leave");
		return person.getRegisteredState();
	}

	public State over() {
		return this;
	}

}

