package HeadFirstJava.Animals;

/**
 * Created by matt on 20/09/15.
 */
public class MainClass {
    public static void main(String args[]) {

        Animals animal = new Animals();
        Feline feline = new Feline();
        Canine canine = new Canine();
        Hippo hippo = new Hippo();
        Dog dog = new Dog();
        Wolf wolf = new Wolf();
        Lion lion = new Lion();
        Cat cat = new Cat();
        Tiger tiger = new Tiger();

        animal.makeNoise();
        animal.eat();
        animal.sleep();
        animal.roam();

        System.out.println();

        feline.makeNoise();
        feline.eat();
        feline.sleep();
        feline.roam();

        System.out.println();

        canine.makeNoise();
        canine.eat();
        canine.sleep();
        canine.roam();

        System.out.println();

        hippo.makeNoise();
        hippo.eat();
        hippo.sleep();
        hippo.roam();

        System.out.println();

        dog.makeNoise();
        dog.eat();
        dog.sleep();
        dog.roam();

        System.out.println();

        wolf.makeNoise();
        wolf.eat();
        wolf.sleep();
        wolf.roam();

        System.out.println();

        tiger.makeNoise();
        tiger.eat();
        tiger.sleep();
        tiger.roam();

        System.out.println();

        lion.makeNoise();
        lion.eat();
        lion.sleep();
        lion.roam();

        System.out.println();

        cat.makeNoise();
        cat.eat();
        cat.sleep();
        cat.roam();

        System.out.println();

    }
}
