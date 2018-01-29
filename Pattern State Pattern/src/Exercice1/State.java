package Exercice1;



public interface State {

    public abstract void coinInserted();

    public abstract void coinReturn();

    public abstract void rightAmountEntered();

    public abstract void buttonPushed();

    public abstract void cupRemoved();

    public abstract void problemDetected();

    public abstract void resetButton();
	
}
