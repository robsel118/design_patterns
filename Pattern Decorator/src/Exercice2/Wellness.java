package Exercice2;


public class Wellness extends ServiceDecorator{

	private Stay stay;
	private int cost;
	private String description;

	public Wellness(Stay stay) {
		this.stay = stay;
		this.cost = 150;
		this.description = "Wellness";

	}

	@Override
	public int getCost() {
		return stay.getCost() + cost;
	}

	@Override
	public String getDescription() {
		return stay.getDescription() + " , " + description;
	}

}
