package Exercice1;


public class MinivanCreator extends CarCreator
{
    @Override
	protected Car createCar()
	{
		return new Minivan() ;
	}
}
