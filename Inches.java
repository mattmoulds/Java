/**
 * Created by matthewmoulds on 16/08/15.
 */
/*
* Compute the number of cubic inches in one cubic mile
*/
// 2 - 1 //
class Inches {
    public static void main(String args[]) {
        long ci;
        long im;

        im = 5280 * 12;
        ci = im * im * im;

        System.out.println("There are " + ci +
                          " cubic inches in cubic mile.");
    }
}