package Exercice1;


public class MobilePhone {

	public static void main(String[] args) {
		Game game = new Game();
		Car car = new Car();
		game.setCommand(0, new ForwardCommand(car));
		game.setCommand(1, new BackwardCommand(car));
		game.setCommand(2, new RightCommand(car));
		game.setCommand(3, new LeftCommand(car));
		
		game.pushKey(2);
		game.pushKey(2);
		game.pushKey(3);
		game.pushKey(2);
		game.pushKey(0);
		game.pushKey(1);
		game.undo();
	}

}
