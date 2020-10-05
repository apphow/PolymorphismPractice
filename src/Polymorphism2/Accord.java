package Polymorphism2;

public class Accord extends Car{

    public Accord(String make,  int cylinders, String color) {
        super(make,  cylinders, color);
    }

    @Override
    public String startEngine() {
        return  getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }

}
