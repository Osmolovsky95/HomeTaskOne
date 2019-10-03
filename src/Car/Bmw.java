package Car;
import Lock.Lock;


public class Bmw extends Car {
    private String name;
    private Engine engine;
    final int numberOfSeats;
    final String categoryCar;
    private Lock lock;

    public Bmw(int numberOfSeats, int weightKg) {
        super(numberOfSeats,weightKg);
        this.numberOfSeats = numberOfSeats;
        this.weightKg = weightKg;
        if (weightKg < 3500) {
            this.categoryCar = "B";
        } else {
            this.categoryCar = "C";
        }
    }


}




