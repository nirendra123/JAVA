import Animal.Animals;
import Bird.Bird;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bird bird =new Bird();
        bird.fly();
        Animals animal=new Animals();
        animal.run();
    }
}