package Exercice1;



public class MedicalEmployee implements Observer {

    private String name;

    public MedicalEmployee(String name, Subject subject) {
        this.name = name;
        subject.registerObserver(this);
    }

    public void update(int position, Problem p, int bloodPressure ,int electroCardioGram, int pulseOximetry) {
        System.out.print("Employee " + name + " receives notification: ");
        System.out.println("Position " + position + " Problem " + p + " bloodPressure " + bloodPressure + " electroCardioGram " + electroCardioGram + " pulseOximetry " + pulseOximetry);
    }


}

