
import Car.Citroen;
import Car.Engine;
import Lock.Lock;
import Wheels.Wheel;


public class TestCar {
    public static void main(String[] args) {
    Key keyCitroen=new Key("Citroen","1383");
    Driver driverFirst=new Driver("Alexander",6);
    driverFirst.setCategoryB("B");
    driverFirst.setCategoryC("false");
    driverFirst.setKey(keyCitroen);

    Wheel firstWinter = new Wheel("Michlen",15,"winter");
    Engine firstEngine = new Engine(1.8,"бензин");
    firstEngine.setName("EW7J4");
    Lock lockCitroen=new Lock("Citroen","1383");

    Citroen citroen=new Citroen(5,1850);
    citroen.setName("C5");
    citroen.setLock(lockCitroen);
    citroen.setWhellWinter(firstWinter);
    citroen.setEngine(firstEngine);
    System.out.println("Создан автомобиль в нем стоит двигатель "+citroen.getEngine().getName()+
            " c объемом: "+citroen.getEngine().getCapacity());
    System.out.println("топливо: "+citroen.getEngine().getFuel());
        System.out.println("шины: "+citroen.getWhell().getName()+", радиус:"+citroen.getWhell().getRadius());
        System.out.println("Тип шин: "+citroen.getWhell().getType());
        System.out.println("Автомобиль подходит под категорию: "+citroen.getCategoryCar());
        System.out.println("Имеет посадочных мест: "+citroen.getNumberOfSeats());
        System.out.println("Установлен замок зажигания типа: "+citroen.getLock().getName());
        checkDriversOnCar(citroen,driverFirst);


    System.out.println("Создан водитель "+driverFirst.getName()+" у которого есть ключ "+driverFirst.getKey().getType()+
            ", а так же права категории B: "+driverFirst.isCategoryB()+ " категории С: "+driverFirst.isCategoryC());
        driverFirst.open();
        driverFirst.start();
        driverFirst.drive();
        driverFirst.sitPeople();
        driverFirst.addFuel();

    }
    public static void checkDriversOnCar(Citroen citroen,Driver driver){
        System.out.println("Проверяем может ли водитель сесть на руль автомобиля");
        if(citroen.getCategoryCar().equals(driver.isCategoryB())){
            System.out.println("Ответ: может");
        }
        else {
            System.out.println("Ответ:Не может");
        }
    }


}
