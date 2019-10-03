package Wheels;

public class Wheel {
    final String name;
   final int radius;
   final String type;

    public Wheel(String name, int radius, String type) {
        this.name = name;
        this.radius = radius;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

    public String getType() {
        return type;
    }
}
