package Exercice1;


public class Knight extends Caracter {
    
    public Knight() {
        System.out.println("[Knight]");
        this.setWeapon(new SwordBehavior());
    }
}
