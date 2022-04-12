package az.iktlab.group_j4.java;

public class Main {
    public static void main(String[] args) {
        CarsFactory factory;

        factory = new ToyotaFactory();
        factory.createCoupe();

      CarsFactory factory2 = new OpelFactory();
        factory2.createCoupe();


    }
}
