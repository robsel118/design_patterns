package Exercice2;


public class HotelRoom extends ServiceDecorator {

	private Stay stay;
	private int cost;
	private String description;

	public HotelRoom(Stay stay) {
		this.stay = stay;
		this.cost = 200;
		this.description = "Hotel Room";

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

