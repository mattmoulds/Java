package PoolPuzzle;

/**
 * Created by matt on 23/08/15.
 */
/*
The count of e1 and e2 are the following
e1 = 1 2 2 3 3 4 4 4
e2 = 0 0 2 2 5 5 6 10
x  = 0 0 1 1 2 2 3 3
*/
public class EchoTestDrive {
    public static void main(String args[]) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();

        int x = 0;
        while ( x < 4) {
            e1.hello();
            e1.count = e1.count + 1;


            System.out.println(e1.count);
            System.out.println(e2.count);
            System.out.println("the value of x is " + x);

            if (x == 3) {
                e2.count = e2.count + 1;


                System.out.println(e1.count);
                System.out.println(e2.count);
            }

            if (x > 0) {
                e2.count = e2.count + e1.count;


                System.out.println(e1.count);
                System.out.println(e2.count);
            }

            x = x +1;
        }
        System.out.println(e2.count);
    }
}
