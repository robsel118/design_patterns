package Exercice1;


/**
 * @author  h40003073
 */
public class CoffeeMachine {

    
    /**
	 * @uml.property  name="coinValue"
	 */
    private double coinValue = 0.0;
    
    /**
	 * @uml.property  name="coffeePrice"
	 */
    private double coffeePrice = 2.2;
    
    /**
	 * @uml.property  name="insertingCoinsState"
	 * @uml.associationEnd  
	 */
    private State insertingCoinsState;
    
    /**
	 * @uml.property  name="serviceNeededState"
	 * @uml.associationEnd  
	 */
    private State serviceNeededState;
    
    /**
	 * @uml.property  name="makeCoffeeState"
	 * @uml.associationEnd  
	 */
    private State makeCoffeeState;
    
    /**
	 * @uml.property  name="userChooseState"
	 * @uml.associationEnd  
	 */
    private State userChooseState;
    
    /**
	 * @uml.property  name="idleState"
	 * @uml.associationEnd  
	 */
    private State idleState;
   
    /**
	 * @uml.property  name="state"
	 * @uml.associationEnd  
	 */
    private State state = idleState;

    public CoffeeMachine() {
        insertingCoinsState = new StateInsertingCoins(this);
        idleState = new StateIdle(this);
        serviceNeededState = new StateServiceNeeded(this);
        makeCoffeeState = new StateMakeCoffee(this);
        userChooseState = new StateUserChoose(this);
        this.setState(idleState);
    }

    public void coinInserted(double coinValue) {
        this.coinValue = coinValue;
        state.coinInserted();
    }

    public void buttonPushed() {
        state.buttonPushed();
    }

    public void coinReturn() {
        state.coinReturn();
    }

    public void cupRemoved() {
        state.cupRemoved();
    }

    public void problemDetected() {
        state.problemDetected();
    }

    
    /**
	 * @return
	 * @uml.property  name="coinValue"
	 */
    public double getCoinValue() {
        return coinValue;
    }

    public void setCoinValue(int coinValue) {
        this.coinValue = coinValue;
    }

    
    /**
	 * @return
	 * @uml.property  name="coffeePrice"
	 */
    public double getCoffeePrice() {
        return coffeePrice;
    }

    
    /**
	 * @return
	 * @uml.property  name="insertingCoinsState"
	 */
    public State getInsertingCoinsState() {
        return insertingCoinsState;
    }

    
    /**
	 * @param insertingCoinsState
	 * @uml.property  name="insertingCoinsState"
	 */
    public void setInsertingCoinsState(State insertingCoinsState) {
        this.insertingCoinsState = insertingCoinsState;
    }

    
    /**
	 * @return
	 * @uml.property  name="serviceNeededState"
	 */
    public State getServiceNeededState() {
        return serviceNeededState;
    }

    
    /**
	 * @param serviceNeededState
	 * @uml.property  name="serviceNeededState"
	 */
    public void setServiceNeededState(State serviceNeededState) {
        this.serviceNeededState = serviceNeededState;
    }

    
    /**
	 * @return
	 * @uml.property  name="makeCoffeeState"
	 */
    public State getMakeCoffeeState() {
        return makeCoffeeState;
    }

    
    /**
	 * @param makeCoffeeState
	 * @uml.property  name="makeCoffeeState"
	 */
    public void setMakeCoffeeState(State makeCoffeeState) {
        this.makeCoffeeState = makeCoffeeState;
    }

    
    /**
	 * @return
	 * @uml.property  name="userChooseState"
	 */
    public State getUserChooseState() {
        return userChooseState;
    }

    
    /**
	 * @param userChooseState
	 * @uml.property  name="userChooseState"
	 */
    public void setUserChooseState(State userChooseState) {
        this.userChooseState = userChooseState;
    }

    
    /**
	 * @return
	 * @uml.property  name="idleState"
	 */
    public State getIdleState() {
        return idleState;
    }

   
    /**
	 * @param idleState
	 * @uml.property  name="idleState"
	 */
    public void setIdleState(State idleState) {
        this.idleState = idleState;
    }

    
    /**
	 * @return
	 * @uml.property  name="state"
	 */
    public State getState() {
        return state;
    }

    
    /**
	 * @param state
	 * @uml.property  name="state"
	 */
    public void setState(State state) {
        this.state = state;
    }
}

