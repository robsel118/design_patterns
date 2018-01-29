package Exercice2;


public class SkiPass extends ServiceDecorator {

	private Stay stay;
	private int cost;
	private String description;

	public SkiPass(Stay stay) {
		this.stay = stay;
		this.cost = 50;
		this.description = "Ski Pass";

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

