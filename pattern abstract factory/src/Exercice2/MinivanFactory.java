package Exercice2;



public class MinivanFactory implements CarFactory {

    public Car createCar() {
        return new Minivan();
    }


}

