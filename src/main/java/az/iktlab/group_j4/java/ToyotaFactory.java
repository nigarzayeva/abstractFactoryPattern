package az.iktlab.group_j4.java;

public class ToyotaFactory  implements CarsFactory{
    @Override
    public Sedan createSedan() {
        return new  ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new  ToyotaCoupe();
    }

}
