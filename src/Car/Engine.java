package Car;

public class Engine {
    private String name;
    final double capacity;
    final  String fuel;

    public double getCapacity() {
        return capacity;
    }

    public String getFuel() {
        return fuel;
    }

    public Engine(double capacity, String fuel) {
        this.capacity = capacity;
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
