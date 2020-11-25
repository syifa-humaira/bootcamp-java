package co.g2academy.basic;

public class LogicalOperator {
    public static void main(String[] args) {
        //logical operator
        int x = 10;
        System.out.println( x < 11 && x < 100);

        int y = 100;
        System.out.println( y > x || y > 10);

        //bit wise operator
        int z = y >> 1;
        System.out.println(z);
        System.out.println( z >> 2 );
        System.out.println( z << 1);

        //casting
        int maxInteger = Integer.MAX_VALUE;
        System.out.println(maxInteger);

        int minValue = Integer.MIN_VALUE;
        System.out.println(minValue);

        double d = 1_000_000_000;

        maxInteger = (int) d;
        System.out.println(maxInteger);

    }

}
