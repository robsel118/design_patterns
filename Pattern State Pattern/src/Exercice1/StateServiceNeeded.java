package Exercice1;


/**
 * @author  h40003073
 */
public class StateServiceNeeded implements State {

   
    /**
	 * @uml.property  name="machine"
	 * @uml.associationEnd  
	 */
    private CoffeeMachine machine;

    public StateServiceNeeded(CoffeeMachine machine) {
        this.machine = machine;
    }

    public void buttonPushed() {
        System.out.println("Service required");
    }

    public void coinInserted() {
        System.out.println("Service required");
    }

    public void coinReturn() {
        System.out.println("Service required");
    }

    public void cupRemoved() {
        //No coffee was made
    }

    public void problemDetected() {
        //Problem is already detected
    }

    public void resetButton() {
        System.out.println("Resetting the machine.");
        machine.setState(machine.getIdleState());
    }

    public void rightAmountEntered() {
        System.out.println("Service required");
    }
}

