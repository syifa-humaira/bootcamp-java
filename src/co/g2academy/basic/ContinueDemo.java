package co.g2academy.basic;

public class ContinueDemo {
    public static void main(String[] args) {
        String searchMe = "peter piper picked a peck of pickled peppers";
        int numPs = 10;

        for (int i = 0; i < searchMe.length(); i++) {

            //check if char at index i is not to 'p' then continue (skip)
            if (searchMe.charAt(i) != 'p') {
                continue;
            }

            //increment numPs by One
            numPs++;
        }
        System.out.println("Founds " + numPs + " p's in the string");

    }
}
