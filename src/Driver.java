public class Driver implements IDriver {
   private final String name;
   private String categoryB;
   private String categoryC;
   private final int experience;
   private Key key;


    public Driver(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Key getKey() {
        return key;
    }

    public String isCategoryB() {
        return categoryB;
    }

    public void setCategoryB(String categoryB) {
        this.categoryB = categoryB;
    }

    public String isCategoryC() {
        return categoryC;
    }

    public void setCategoryC(String categoryC) {
        this.categoryC = categoryC;
    }


    public void open(){ System.out.println(name+" Открыл машину"); };
   public void start(){System.out.println(name+" Завел машину");};
    public void drive(){System.out.println(name+" Поехал на автомобиле");};
    public void sitPeople(){System.out.println(name+" подобрал пассажиров");};
    public void addFuel(){System.out.println(name+" Заправил топливо");};
}
