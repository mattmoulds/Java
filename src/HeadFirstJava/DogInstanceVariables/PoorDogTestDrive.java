package HeadFirstJava.DogInstanceVariables;

/**
 * Created by matt on 26/08/15.
 */
public class PoorDogTestDrive {
    public static void main(String args[]) {
        PoorDog one = new PoorDog();
        System.out.println("Dog size is " + one.getSize());
        System.out.println("Dog name is" + one.getName());
    }
}
