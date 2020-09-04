package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);

        train(new Duck());
        train(new Parrot());
//        circus.animal.Animal a2 = new circus.animal.Animal();
//        circus.animal.Bird b2 = new circus.animal.Bird();
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {  // works because duck is a bird
        if (bird instanceof Duck) { // ensures only objects which are ducks will run the code below - prevents errors
            Duck d = (Duck) bird;   // casting
            d.swim();   // works because the original object passed in is a duck!!
        }
    }
}
