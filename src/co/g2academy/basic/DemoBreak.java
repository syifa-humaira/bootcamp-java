package co.g2academy.basic;

public class DemoBreak {
    public static void main(String[] args) {

        int [] arrayOf =
                {32,97, 3, 594,
                12,876,2000,8,622,
                127};

        int searchFor = 12;
        boolean foundIt = false;

        int i = 0;
        for ( ; i < arrayOf.length; i++){
            if (arrayOf[i] == searchFor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchFor + " at index " + i);
        } else {
            System.out.println(searchFor + " is not the array");
        }
    }
}
