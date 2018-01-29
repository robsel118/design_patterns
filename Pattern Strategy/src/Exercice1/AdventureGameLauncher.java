package Exercice1;



public class AdventureGameLauncher {

    public AdventureGameLauncher() {
    }
    
    public static void main(String[] args) {
        AdventureGameLauncher launcher = new AdventureGameLauncher();
        launcher.test();
    }
    
    public void test() {
        Caracter king1 = new King();
        king1.fight();
        
        Caracter king2 = new King();
        king2.setWeapon(new BowAndArrowBehavior());
        king2.fight();
        king2.setWeapon(new KnifeBehavior());
        
        Caracter queen = new Queen();
        queen.setWeapon(new KnifeBehavior());
        queen.fight();
        
        Caracter troll = new Troll();
        troll.fight();
        
        Caracter knight = new Knight();
        knight.fight();
    }
}

