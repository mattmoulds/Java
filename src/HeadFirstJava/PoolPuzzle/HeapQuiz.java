package HeadFirstJava.PoolPuzzle;

/**
 * Created by matt on 24/08/15.
 */
public class HeapQuiz {
    int id = 0;
    public static void main(String args[]) {
        int x = 0;
        HeapQuiz [] hq = new HeapQuiz[5];
        while ( x < 3 ) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x = x +1;
        }
        hq[3] = hq[1];
        // hq3 is now assigned the value of 1
        hq[4] = hq[1];
        // hq4 is now assigned the value of 1
        hq[3] = null;
        // hq3 is now assigned the value of null
        hq[4] = hq[0];
        // hq 4 is now assigned the value of 0
        hq[0] = hq[3];
        // hq0 is now assigned the value of null
        hq[3] = hq[2];
        // hq3 is now assigned the value of 2
        hq[2] = hq[0];
        // hq2 is now assigned the value of null
        /*  hq0 is null
            hq1 is 1
            hq2 is null
            hq3 is 2
            hq4 is 0
        */

    }
}
