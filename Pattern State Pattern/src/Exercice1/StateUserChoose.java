package Exercice1;


/**
 * @author  h40003073
 */
public class StateUserChoose implements State {

    
    /**
	 * @uml.property  name="machine"
	 * @uml.associationEnd  
	 */
    private CoffeeMachine machine;

    public StateUserChoose(CoffeeMachine machine) {
        this.machine = machine;
    }

    public void buttonPushed() {
        System.out.println("Thank you for your choice. The machine is making your coffee...");
        machine.setState(machine.getMakeCoffeeState());
    }

    public void coinInserted() {
        System.out.println("Coins already inserted.");
    }

    public void coinReturn() {
        System.out.println("Coin returned.");
        machine.setCoinValue(0);
        machine.setState(machine.getIdleState());
    }

    public void cupRemoved() {
        //No coffee was made
    }

    public void problemDetected() {
        //No coffee was made
    }

    public void resetButton() {
        System.out.println("Impossible to reset the machine now.");
    }

    public void rightAmountEntered() {
    }
}

