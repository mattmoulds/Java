package src.JavaBeginGuide;

/**
 * Created by matthewmoulds on 12/09/15.
 */
public class PromoDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b * b; // No cast needed as the result is already elevated to an int

        b = 10;
        b = (byte) (b * b); // cast is needed to assign an int to a byte

        System.out.println("i and b: " + i + " " + b);
    }
}
