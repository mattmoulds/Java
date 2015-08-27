package HeadFirstJava.PoolPuzzle;

/**
 * Created by matt on 27/08/15.
 */
public class Puzzle4 {
    public static void main(String args[]) {
        Puzzle4b[] obs = new Puzzle4b[6];
        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 6) {
            obs[x] = new Puzzle4b();
            obs[x].ivar = y;
            System.out.println(y);
            y = y * 10;
            x = x + 1;
        }

        x = 6;
        while (x > 0) {
            x = x -1;
            result = result + obs[x].doStuff(x);
            System.out.println(obs[x].doStuff(x));
        }
        System.out.println("Result " + result);
    }
}

/*
Comments to assist me understand the above

obs[0].ivar = 1
obs[1].ivar = 10
obs[2].ivar = 100
obs[3].ivar = 1000
obs[4].ivar = 10000
obs[5].ivar = 100000

obs[5].doStuff / factor = 5
obs[4].doStuff / factor = 4
obs[3].doStuff / factor = 3
obs[2].doStuff / factor = 2
obs[1].doStuff / factor = 1
obs[0].doStuff / factor = 0

obs[5].ivar * factor = 500000
obs[4].ivar * factor = 40000
obs[3].ivar * factor = 3000
obs[2].ivar * factor = 300
obs[1].ivar * factor = 40
obs[0].ivar * factor = 5
total = 543345
*/


