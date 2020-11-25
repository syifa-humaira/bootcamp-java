package co.g2academy.Array;

public class ArrayResizing {
    public int[] resize(int[] initialArray, int n) {

        //create New Array
        int[] resizedArray = new int[n];

        //copy old array to new array
        //for (int i = 0; i < initialArray.length; i++) {
        //  resizedArray[i] = initialArray[i];
        // }
        // return resizedArray;


        System.arraycopy(initialArray, 0, resizedArray,0, initialArray.length);
        return resizedArray;
    }
}
