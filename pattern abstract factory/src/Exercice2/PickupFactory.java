package Exercice2;


public class PickupFactory implements CarFactory {

    public Car createCar() {
        return new Pickup();
    }

}

