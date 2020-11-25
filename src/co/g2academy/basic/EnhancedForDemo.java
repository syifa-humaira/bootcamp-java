package co.g2academy.basic;

public class EnhancedForDemo {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6,7,8,9,10};
        for ( int item : number) { // melakukan perhitungan tanpa membuat penambahan
            System.out.println(" Index nya " + item);
        }
    }
}
