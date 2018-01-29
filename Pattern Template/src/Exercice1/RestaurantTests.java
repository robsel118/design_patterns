package Exercice1;


public class RestaurantTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Restaurant ilGolossone = new ItalianRestaurant("Il Golossone - Zurich");
		Restaurant leVieuxChalais = new SwissRestaurant("Le Vieux Chalais - Gruyre");		
		ilGolossone.prepareDinner();
		leVieuxChalais.prepareDinner();
	}

}
