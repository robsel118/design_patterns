package Exercice1;


public class SimpleSingletonSensorsManager extends SingletonSensorManager {

   
    private static SingletonSensorManager instance;
    
    private SimpleSingletonSensorsManager() {}

    
    public static SingletonSensorManager getInstance() {
        if (instance == null) {
            instance = new SimpleSingletonSensorsManager();
        }
        return instance;
    }
}
