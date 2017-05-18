import Factory.Car;

/**
 * Created by sf2016 on 18.05.2017.
 */
public class FactoryMethod {
    
    public static Car produce(String type) {
        if (type == "Type T") {

            return new FactoryMethod.TypeT();
        }
        return null;
    }

   // return null;


    private static class TypeT extends Car {
        public TypeT() {
            this.model = "TypeT";

        }

    }
    public static void main (String[] args){
        System.out.println(">>>" + FactoryMethod.produce("TypeT"));
    }

}

