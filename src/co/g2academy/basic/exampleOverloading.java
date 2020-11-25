package co.g2academy.basic;

public class exampleOverloading {

    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        double c = 7.3;
        double d = 9.4;
        int result1 = minFunction(a, b);

        //same function name but different parameters
        double result2 = minFunction(c, d);

        System.out.println("Minimum values : " + result1);
        System.out.println("Minimum values : " + result2);
    }


    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }

    public static double minFunction(double n1, double n2) {

        double min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }
}
