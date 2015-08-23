package JavaBeginGuide;

/**
 * Created by matthewmoulds on 16/08/15.
 */

/*
 * This program illustrates the differences
 * between int and double
 * call this file Example3
 *
 */
// 1 - 3 //
class Example3 {
    public static void main(String args[]) {
        int var; // this declares an int variable
        double x; // this declares a floating-point variable

        var = 10; // assign var the value of 10
        x = 10.0; // assign x the value of 10.0

        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println(); // print a blank line

        // now, divide both by 4
        var = var / 4;
        x = x / 4;

        System.out.println("var after division: " + var);
        System.out.println("x after division: " + x);
    }
}