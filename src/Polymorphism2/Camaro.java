package Polymorphism2;

public class Camaro extends Car{
    public Camaro(String make,  int cylinders,  String color) {
        super(make,  cylinders,  color);

    }

    @Override
    public String startEngine() {
        return "Camaro -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Camaro -> accelerate()";
    }

    @Override
    public String brake() {
        return "Camaro -> brake()";
    }


}
