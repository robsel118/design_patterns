package Exercice1;


public class EagerSingletonSensorsManager extends SingletonSensorManager {

   
    private static SingletonSensorManager instance = new EagerSingletonSensorsManager();
    
    private EagerSingletonSensorsManager() {}

    
    public static SingletonSensorManager getInstance() {
        return instance;
    }
}
