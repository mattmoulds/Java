package HeadFirstJava;

public class PhraseOMatic {
    public static void main(String args[]) {
        //test
        // Make three sets of words to choose from
        String[] wordListOne = {"24/7","multi-Tier","30,00 foot","B-to-B","win-win","frontend","web based"
        ,"pervasive","smart","sixsigma","critical-path","dynamic"};

        String[] wordListTwo = {"empowered","sticky","value added","oriented","centric","distributed","clustered",
        "branded","outside-the-box","positioned","networked","focused","leveraged","aligned","targeted","shared",
        "cooperative","acceletated"};

        String[] wordListThree = {"process","tipping point","solution","architecture","core competency","strategy",
        "mindshare","portal","space","visitor","paradigm","mission"};

        // Find out the words in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // Not build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // Print out the new phrase
        System.out.println("What we need is a " + phrase);
    }
}