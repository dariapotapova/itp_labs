import java.util.ArrayList;

public class AbstractClassDemonstration {
    public static void main(String[] args) {
        Creature[] array = new Creature[3];
        array[0] = new Human();
        array[1] = new Dog();
        array[2] = new Alien();
        array[0].name = "Jack";
        array[1].name = "Bobik";
        array[2].name = "Boo";
        for (int i = 0; i < array.length; i++) {
            array[i].born();
            array[i].die();
        }

    }
}
