package Exercice2;



public interface Subject {

	abstract void registerObserver(Observer o);

	public abstract void removeObserver(Observer o);

	public abstract void notifyObservers();
}

