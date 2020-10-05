
class Movie{
    private String name;

    public Movie() {
    }

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "No Plot here";
    }
        }

 class Jaws extends Movie{
     public Jaws() {
         super("Jaws");
     }
     public String plot() {
         return "A shark attacks at a beach.";
     }
 }

 class IndependenceDay extends Movie{

     public IndependenceDay() {
         super("IndependenceDay");
     }

     @Override
     public String plot() {
         return "Aliens are trying to conquer earth.";
     }
 }

 class MazeRunner extends Movie{

     public MazeRunner() {
         super("Maze Runner");
     }

     @Override
     public String plot() {
         return "Youth escaping a maze";
     }
 }

 class StarWars extends Movie {

     public StarWars() {
         super("Star Wars");
     }

     @Override
     public String plot() {
         return "The dark side vs the force";
     }
 }

 class Forgettable extends Movie{

     public Forgettable() {
         super("Forgettable");
     }
 }

public class Main {

    public static void main(String[] args) {

        for(int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + " : " + movie.getName() + "\n" +
                                "Plot: " + movie.plot() + "\n" );
        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
            default:
                return null;
        }
    }
}
