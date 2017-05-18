package singletone;

/**
 * Created by sf2016 on 18.05.2017.
 */
public class SingletoneExample {
    public static void main (String [] args){
        Philosopher hl = Philosopher.createNew("Plato");
        Philosopher hl2 = Philosopher.createNew("Aristotle");
        System.out.println("hl==hl2" + (hl == hl2));
        System.out.println("hl > " + hl);
        System.out.println("hl2 > " + hl2);
    }

}
