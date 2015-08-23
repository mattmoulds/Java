/**
 * Created by matthewmoulds on 16/08/15.
 */
/*
* Self test
* The moons gravity is 17% of that on Earths. Write a program which computes your weight on the moon =
*/
// T1 - 2 //
class GravityTask {
    public static void main(String args[]) {
        double earthWeight, moonWeight;

        earthWeight = 100;
        moonWeight = earthWeight * 0.17;

        System.out.println(earthWeight + "lbs on the moon would equal " + moonWeight + "lbs");
    }
}
