package Polymorphism2;

public class Car {
    private String make;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String color;

    public Car(String make,  int cylinders, String color) {
        this.make = make;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public boolean isEngine() {
        return engine;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", engine=" + engine +
                ", cylinders=" + cylinders +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }

}
