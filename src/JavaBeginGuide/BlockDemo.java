package JavaBeginGuide;

/**
 * Created by matthewmoulds on 16/08/15.
 */
/*
* Demonstrate a block of code
* Call this file BlockDemo.java
*/
// 1 - 7 //
class BlockDemo {
    public static void main(String args[]) {
        double i, j, d;

        i = 5;
        j = 10;

        // the target of this if is a block
        if(i != 0){
            System.out.println("i does not equal 0");
            d = j / i;
            System.out.println("j / i id " + d);
        }
    }
}
