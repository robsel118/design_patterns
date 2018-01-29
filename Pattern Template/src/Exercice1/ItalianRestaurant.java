package Exercice1;


public class ItalianRestaurant extends Restaurant {

	public ItalianRestaurant(String name) {
		this.name = name;
	}
	
	@Override
	void preparDessert() {
		// TODO Auto-generated method stub

	}

	@Override
	void prepareCheese() {
		System.out.println("Adding Parmegiano");
	}

	@Override
	void prepareCoffee() {
		System.out.println("Fine italian espresso");
	}

	@Override
	void prepareMainMenu() {
		System.out.println("Meat and pasta.");
	}

	@Override
	void prepareVegetables() {
		System.out.println("And good zucchini.");
	}

}
