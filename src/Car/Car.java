package Car;


import Lock.Lock;
import Wheels.Wheel;


abstract class Car {
    String name;
    Engine engine;
    int numberOfSeats;
    String categoryCar;
    Lock lock;
    Wheel whee;

   abstract public String getName();


}
