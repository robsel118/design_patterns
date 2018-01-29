package Exercice1;

public class SynchSingletonSensorsManager extends SingletonSensorManager {

    
    private static SingletonSensorManager instance;
    
    private SynchSingletonSensorsManager() {}

   
    public static synchronized SingletonSensorManager getInstance() {
        if (instance == null) {
            instance = new SynchSingletonSensorsManager();
        }
        return instance;
    }
}

