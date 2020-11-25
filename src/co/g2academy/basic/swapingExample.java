package co.g2academy.basic;

public class swapingExample {

    public static void main(String[] args) {
        int a = 30;
        int b = 45;

        System.out.println("Before swaping, a = " + a + " and b = " + b);

        swapfunction(a, b);
        System.out.println("Now, Before and After swapping values will be the same");
        System.out.println("After swapping a = " + a + " and b = " + b);
    }

    public static void swapfunction(int a, int b) {
        System.out.println("After swaping (inside), a = " + a + " and b = " + b);

        //SWAP variable a and b

        int c = a;
        a = b;
        b = c;

        System.out.println("After swaping (inside), a = " + a + " and b = " + b);
    }
}
