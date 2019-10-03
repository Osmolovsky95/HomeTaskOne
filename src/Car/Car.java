package Car;


import Lock.Lock;
import Wheels.Wheel;


public abstract class Car {
    String name;
    Engine engine;
   int numberOfSeats;
    String categoryCar;
    Lock lock;
    Wheel whell;
    int weightKg;


    public Car(int numberOfSeats, int weightKg) {
        this.numberOfSeats = numberOfSeats;
        this.weightKg = weightKg;
        if(weightKg<3500) {
            this.categoryCar = "B";
        }
        else {
            this.categoryCar="C";
        }
    }




    public Wheel getWhell() {
        return whell;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getCategoryCar() {
        return categoryCar;
    }

    public void setWhellWinter(Wheel whell) {
        this.whell = whell;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }


}
