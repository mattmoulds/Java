package JavaBeginGuide;

/**
 * Created by matthewmoulds on 16/08/15.
 */
/*
* Demonstrate the for loop
*
* Call this file ForDemo.java.
*/
// 1 - 6 //
class ForDemo {
    public static void main(String args[]) {
        int count;

        //for(initialization; condition; iteration) statement;
        for(count = 0; count < 5; count = count++)
            System.out.println("This is count: " + count);

        System.out.println("Done!");
    }
}