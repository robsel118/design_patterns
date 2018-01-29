package Exercice2;


public class Montana extends Stay {

	private int cost = 600;

	public Montana() {

		description = "Montana";
	}

	@Override
	public int getCost() {
		return cost;
	}

}

