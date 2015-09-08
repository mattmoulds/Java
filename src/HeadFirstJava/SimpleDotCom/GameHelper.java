package HeadFirstJava.SimpleDotCom;

/**
 * Created by matt on 08/09/15.
 */
import java.io.*;
public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0 ) return null;

        } catch (IOException e) {
            System.out.println("IO Exception:" + e);
        }

        return inputLine;
    }
}
