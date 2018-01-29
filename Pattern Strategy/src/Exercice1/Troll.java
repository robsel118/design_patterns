package Exercice1;


public class Troll extends Caracter {
    
    public Troll() {
        System.out.println("[Troll]");
        this.setWeapon(new AxeBehavior());
    }
}
