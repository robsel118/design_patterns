package Exercice1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;


public class PatientMonitoring implements Subject {

	/**
	 * @uml.property  name="observers"
	 * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" inverse="patientMonitoring:ch.hevs.designPatterns.observer.ex1.Observer"
	 */
	private List<Observer> observers;

    private int bloodPressure;
    private int maxBloodPressure;
    private int electroCardioGram;
    private int maxElectroCardioGram;
    private int pulseOximetry;
    private int maxPulseOximetry;
    private int position; // room number
    /**
	 * @uml.property  name="currentProblem"
	 * @uml.associationEnd  
	 */
    private Problem currentProblem;

    public PatientMonitoring(int startingPosition, int maxBloodPressure, int maxElectroCardioGram, int maxPulseOximetry) {
        observers = new ArrayList<Observer>();
        this.maxBloodPressure = maxBloodPressure;
        this.maxElectroCardioGram = maxElectroCardioGram;
        this.maxPulseOximetry = maxPulseOximetry;
        this.position = startingPosition;
        this.currentProblem = Problem.noProblem;
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    public void notifyObservers() {
        for (Observer o : observers)
            o.update(this.position, this.currentProblem,this.bloodPressure,this.electroCardioGram,this.pulseOximetry);
    }

    /**
	 * @param newBloodPressure
	 * @uml.property  name="bloodPressure"
	 */
    public void setBloodPressure(int newBloodPressure) {
		this.bloodPressure = newBloodPressure;
		if (newBloodPressure > maxBloodPressure) {
			this.currentProblem = Problem.bloodPressure;
			notifyObservers();
		}
	}
    /**
	 * @param newElectroCardioGram
	 * @uml.property  name="electroCardioGram"
	 */
    public void setElectroCardioGram(int newElectroCardioGram) {
		this.electroCardioGram = newElectroCardioGram;
		if (newElectroCardioGram > maxElectroCardioGram) {
			this.currentProblem = Problem.ECG;
			notifyObservers();
		}
	}
    /**
	 * @param newPulseOximetry
	 * @uml.property  name="pulseOximetry"
	 */
    public void setPulseOximetry(int newPulseOximetry) {
		this.pulseOximetry = newPulseOximetry;
		if (newPulseOximetry > maxPulseOximetry) {
			this.currentProblem = Problem.oximetry;
			notifyObservers();
		}
	}

    /**
	 * @param position
	 * @uml.property  name="position"
	 */
    public void setPosition(int position) {
		this.position = position;
	}


}
