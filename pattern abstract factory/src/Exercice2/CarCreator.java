package Exercice2;


public class CarCreator {

    /**
	 * @uml.property  name="carFactory"
	 * @uml.associationEnd  
	 */
    private CarFactory carFactory;

    public CarCreator(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public Car orderCar(String color) {
        Car car = createCar();

        car.installEngine();
        car.addExtras();
        car.paint(color);

        return car;
    }

    protected Car createCar() {
        return carFactory.createCar();
    }

}

