package Exercice2;

import java.util.ArrayList;
import java.util.List;

public class Team implements Playable {
	private List<Playable> players = new ArrayList<Playable>();

	public void add(Playable p) {
		players.add(p);
	}
	
	public void remove(Playable p) {
		players.remove(p);
	}
	
	public void cry() {
		for (Playable p : players) 
			p.cry();
	}

	public void enterField() {
		for (Playable p : players) 
			p.enterField();
	}

	public void shoot() {
		for (Playable p : players) 
			p.shoot();
	}

	public void simulateInjury() {
		for (Playable p : players) 
			p.simulateInjury();
	}
	
	
	
}

