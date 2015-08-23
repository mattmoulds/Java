package JavaBeginGuide;

/**
 * Created by matthewmoulds on 16/08/15.
 */
/*
* Self Test
* Convert inches to meters
*/
// T1 - 1 //
class InchToMeters {
    public static void main(String args[]) {
        double inch, meter, feet;
        int counter;

        feet =  12 * 12;

        counter = 0;
        for(inch = 1; inch <= feet; inch++) {
            meter = inch * 39.37;
            System.out.println(inch + " inches equals " + meter + "meters");

            counter++;
            if(counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
