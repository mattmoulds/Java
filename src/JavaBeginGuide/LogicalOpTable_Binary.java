package JavaBeginGuide;

/**
 * Created by matt on 12/09/15.
 */
public class LogicalOpTable_Binary {
    public static void main(String args[]) {

        boolean p, q;


        System.out.println("P\tQ\tAND\tOR\tXOR\ttNOT");

        p = true; q = true;
        int pb = (p) ? 1 : 0;
        int qb = (q) ? 1 : 0;
        System.out.print(pb + "\t" + qb +"\t");
        System.out.print((pb & qb) + "\t" + (pb | qb) + "\t");
        System.out.println((pb ^ qb) + "\t" + (!p));

        p = true; q = false;
        pb = (p) ? 1 : 0;
        qb = (q) ? 1 : 0;
        System.out.print(pb + "\t" + qb +"\t");
        System.out.print((pb&qb) + "\t" + (pb|qb) + "\t");
        System.out.println((pb ^ qb) + "\t" + (!p));

        p = false; q = true;
        pb = (p) ? 1 : 0;
        qb = (q) ? 1 : 0;
        System.out.print(pb + "\t" + qb +"\t");
        System.out.print((pb&qb) + "\t" + (pb|qb) + "\t");
        System.out.println((pb^qb) + "\t" + (!p));

        p = false; q = false;
        pb = (p) ? 1 : 0;
        qb = (q) ? 1 : 0;
        System.out.print(pb + "\t" + qb +"\t");
        System.out.print((pb&qb) + "\t" + (pb|qb) + "\t");
        System.out.println((pb^qb) + "\t" + (!p));
    }
}
