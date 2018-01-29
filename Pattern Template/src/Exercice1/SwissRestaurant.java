package Exercice1;


public class SwissRestaurant extends Restaurant {

	public SwissRestaurant(String name) {
		this.name = name;
	}

	@Override
	void preparDessert() {
		System.out.println("Mrigues.");
	}

	@Override
	void prepareCheese() {
		System.out.println("Gruyre.");
	}

	@Override
	void prepareCoffee() {
		System.out.println("Nespresso.");
	}

	@Override
	void prepareMainMenu() {
		System.out.println("Papet vaudois");
	}

	@Override
	void prepareVegetables() {
		System.out.println("Salade");
	}

}

