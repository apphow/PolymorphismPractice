package Polymorphism2;

public class EntryPointForPractice {
    public static void main(String[] args) {
        Car baseCar = new Car("Base car",  6, "Maroon");
        System.out.println(baseCar.startEngine());
        System.out.println(baseCar.accelerate());
        System.out.println(baseCar.brake() + "\n");

        Accord honda = new Accord("Honda", 4,  "Maroon");
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake() + "\n");


        Camaro camaro = new Camaro("Camaro", 6, "Red");
        System.out.println(camaro.startEngine());
        System.out.println(camaro.accelerate());
        System.out.println(camaro.brake() + "\n");

        CrossTrek crossTrek = new CrossTrek("CrossTrek", 4, "Burnt orange");
        System.out.println(crossTrek.getMake() + " -> color -> " + crossTrek.getColor());
        System.out.println(crossTrek.startEngine());
        System.out.println(crossTrek.accelerate());
        System.out.println(crossTrek.brake() + "\n");


        for (int i = 1; i < 4; i++) {
            Car car = randomCar();
            System.out.println("Car # " + i + " : " + car.getMake() + "\n" +
                    "Start your engines: " + car.startEngine() + "\n" +
                    "Accelerate: " + car.accelerate() + "\n" + "Brake: " + car.brake() +"\nCar color: " + car.getColor() + "\n");
        }
    }
        public static Car randomCar() {
            int randomNumber = (int) (Math.random() * 3) + 1;
            System.out.println("Random number generated was " + randomNumber);

            switch (randomNumber) {
                case 1:
                    return new Accord("Accord", 6, "Maroon");

                case 2:
                    return new Camaro("Camaro", 6,"Red");
                case 3:
                    return new CrossTrek("CrossTrek", 4,  "Burnt orange");
                default:
                    return null;
            }
        }
    }

