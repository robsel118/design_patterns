package Exercice1;

public class PickupCreator extends CarCreator
{
    @Override
	protected Car createCar()
	{
		// TODO Auto-generated method stub
		return new Pickup();
	}
}

