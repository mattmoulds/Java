package HeadFirstJava;

/**
 * Created by matt on 24/08/15.
 */
public class MIx4 {
    int counter = 0;
    public static void main(String args[]) {
        int count = 0;
        MIx4 [] m4a = new MIx4[20];
        int x = 0;
        while (x < 9) {
            m4a[x] = new MIx4();
            m4a[x].counter = m4a[x].counter + 1;
            count = count + 1;
            count = count + m4a[x].mayBeNew(x);
            x = x + 1;
        }
        System.out.println(count + " " + m4a[1].counter);
    }

    public int mayBeNew(int index) {
        if (index < 5) {
            MIx4 m4 = new MIx4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}
