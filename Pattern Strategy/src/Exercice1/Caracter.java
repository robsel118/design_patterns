package Exercice1;



public abstract class Caracter {

    /**
	 * @uml.property  name="weapon"
	 * @uml.associationEnd  
	 */
    private WeaponBehavior weapon = null;
    
    public Caracter() {
    }
    
    public void fight() {
        if (this.weapon == null) {
            System.out.println("no weapon for this caracter");
        } else {
            this.weapon.useWeapon();
        }
    }
    
    /**
	 * @param arme
	 * @uml.property  name="weapon"
	 */
    public void setWeapon(WeaponBehavior arme) {
		this.weapon = arme;
	}

}

