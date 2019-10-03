package Car;
import Lock.Lock;
import Wheels.Wheel;

import java.sql.Driver;

public class Citroen extends Car {
    private String name;
    private Engine engine;
    final int numberOfSeats;
    private String categoryCar;
    private Lock lock;
    private Wheel whell;
    final int weightKg;

    public Citroen(int numberOfSeats, int weightKg) {
        super(numberOfSeats,weightKg);
               this.numberOfSeats = numberOfSeats;
       this.weightKg = weightKg;
        if(weightKg<3500) {
            this.categoryCar = "B";
        }
            else {
                this.categoryCar="C";
            }
        }
    }

