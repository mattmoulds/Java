package HeadFirstJava.NewDog;

/**
 * Created by matt on 23/08/15.
 */
public class Dog {
    String name;
    public static void main(String args[]) {

        // Make a dog Object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        // Now make a dog array
        Dog[] myDogs = new Dog[3];

        // and put dogs into the array
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // Now access the dogs using the array
        // references

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        // What is myDogs[2] name?
        System.out.print("Last dog's name is ");
        System.out.println(myDogs[2].name);

        // Now loop through the array
        // and tell the dogs to bark
        int x = 0;
        while(x < myDogs.length) {
            myDogs[x].bark();
            x = x +1;
        }
    }

    public void bark() {
        System.out.println(name + " says Ruff!");
    }
}
