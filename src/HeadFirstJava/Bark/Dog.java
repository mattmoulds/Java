package HeadFirstJava.Bark;

/**
 * Created by matt on 25/08/15.
 */
public class Dog {
    void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            System.out.println("ruff");
            numOfBarks = numOfBarks -1;
        }
    }
}
