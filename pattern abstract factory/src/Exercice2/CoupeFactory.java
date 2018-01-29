package Exercice2;


public class CoupeFactory implements CarFactory {

    public Car createCar() {
        return new Coupe();
    }

}

