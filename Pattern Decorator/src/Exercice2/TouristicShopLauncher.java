package Exercice2;


public class TouristicShopLauncher {


	public static void main(String[] args) {
		
		Stay verbier = new Verbier();
		verbier = new SkiPass(verbier);
		verbier = new HotelRoom(verbier);
		
		displayStay(verbier);
		
		Stay montana = new Montana();
		montana = new Wellness(montana);
		montana = new SkiPass(montana);
		montana = new SkiPass(montana);
		
		displayStay(montana);

	}
	
	public static void displayStay(Stay stay){
		System.out.println("Package stay : " + stay.getDescription());
		System.out.println("Cost : " + stay.getCost() + "\n");
	}
	
	

}

