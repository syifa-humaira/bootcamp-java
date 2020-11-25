package co.g2academy.Array;

public class ArrayEnhancedLoop {

    private int list[]  = {1,5,6,8,10};

    public int calculateSumOfAllItem() {
        // penjumlahan dimulai dari 0
        // perkalian dimulai dari 1
        int sum = 0;
        for (int element : list) {
            sum = sum + element; // calculation
        }
        return sum;
    }

    public int calculateMultiplication() {

        int multi = 1;
        for (int element : list) {
            multi = multi * element;
        }
        return multi;
    }

    public int calculateAverage() {
        return calculateSumOfAllItem() / list.length;
    }
}
