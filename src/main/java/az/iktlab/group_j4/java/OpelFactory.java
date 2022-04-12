package az.iktlab.group_j4.java;

public class OpelFactory implements CarsFactory{


    @Override
    public Sedan createSedan() {
        return null;
    }

    @Override
    public Coupe createCoupe() {
        return new OpelCoupe();
    }
}
