package CodeMagnets;

/**
 * Created by matt on 23/08/15.
 */
public class DrumKitTestDrive {
    public static void main(String args[]) {

        DrumKit d = new DrumKit();

        d.playSnare();
        d.playTopHat();

        d.snare = false;

        if (d.snare == true) {
            d.playSnare();
        }
    }
}
