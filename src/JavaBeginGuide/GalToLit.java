package JavaBeginGuide;

/**
 * Created by matthewmoulds on 16/08/15.
 */

/*
* Try this 1 - 1
* This program converts gallons to liter.
* Call this program GalToLit.java.
*/
// 1 - 4 //

class GalToLit {
    public static void main(String args[]) {
        double gallons; // holds the number of gallons
        double liters; // holds the nuber of liters

        gallons = 10; // start with 10 gallons
        liters = gallons * 3.7854; // convert to liters

        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}
