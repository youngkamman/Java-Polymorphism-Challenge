public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car( int cylinders, String name) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate () {
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}
