package Polymorphism2;

public class CrossTrek  extends Car{
    public CrossTrek(String make, int cylinders, String color) {
        super(make, cylinders, color);
    }

    @Override
    public String startEngine() {
        return "CrossTrek -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "CrossTrek -> accelerate()";
    }

    @Override
    public String brake() {
        return "CrossTrek -> brake()";
    }
}
