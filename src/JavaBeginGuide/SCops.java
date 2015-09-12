package JavaBeginGuide;

/**
 * Created by matt on 12/09/15.
 */
public class SCops {
    public static void main(String args[]) {
        int n, d, q;

        n = 10;
        d = 2;
        if(d !=0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        d = 0; // d is now set to 0

        // since d is zero the second operand is not evaluated.
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        /*
        Trying the same without short-circuit operator.
        This will cause a divide by zero error
         */

        if(d != 0 & (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
    }
}
