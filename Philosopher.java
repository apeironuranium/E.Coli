package singletone;

/**
 * Created by sf2016 on 18.05.2017.
 */
public class Philosopher {
    private static Philosopher Instance = null;
    private String name;

    public static synchronized Philosopher createNew(String name){
        if (Instance == null){
            Instance = new Philosopher(name);
        }
        return Instance;
    }
    //private static boolean created = false;

    private Philosopher(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Philosopher{" +
                "name='" + name + '\'' +
                '}';
    }
}
