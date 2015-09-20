package HeadFirstJava.Animals;

/**
 * Created by matt on 20/09/15.
 */
public class PetOwner {
    public void start() {
        Vet v = new Vet();
        Dog d = new Dog();
        Hippo h =  new Hippo();

        v.giveShot(d);
        v.giveShot(h);
    }
}
