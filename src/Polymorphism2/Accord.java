package Polymorphism2;

public class Accord extends Car{

    public Accord(String make,  int cylinders, String color) {
        super(make,  cylinders, color);
    }

    @Override
    public String startEngine() {
        return "Accord -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Accord -> accelerate()";
    }

    @Override
    public String brake() {
        return "Accord -> brake()";
    }

}
