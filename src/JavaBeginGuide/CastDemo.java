package JavaBeginGuide;

/**
 * Created by matt on 12/09/15.
 */
public class CastDemo {
    public static void main(String args[]) {
        double x,y;
        byte b;
        int i;
        char ch;

        x = 10.3;
        y = 3.0;

        i = (int) (x / y); // cast double to int
        System.out.println("Integer coutcome of x / y: " + i);

        i = 100;
        b = (byte) i; // no loss of info here as a byte can hold the value 100
        System.out.println("Vaule of b: " +b);

        i = 257;
        b = (byte) i; // information loss as a byte cannot hold the value 257
        System.out.println("Value of b: " + b);

        b = 88; // ASCII code for x
        ch = (char) b; // cast between incompatible types
        System.out.println("ch: " + ch);

    }
}
