package Car;
import Lock.Lock;


public class Bmw extends Car {
    private String name;
    private Engine engine;
    final int numberOfSeats;
    final String categoryCar;
    private Lock lock;

    public Bmw(int numberOfSeats, String categoryCar) {
        this.numberOfSeats = numberOfSeats;
        this.categoryCar = categoryCar;
    }

    public String getName() {
        return name;
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

