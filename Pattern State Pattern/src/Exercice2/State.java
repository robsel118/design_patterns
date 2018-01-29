package Exercice2;



public interface State {
	public State leave();
	public State enter();
	public State ask();
	public State over();
	public State handover();
}

