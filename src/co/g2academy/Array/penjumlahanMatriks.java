package co.g2academy.Array;

public class penjumlahanMatriks {

        public static void main(String[] args) {
            int matrixa[][] = new int[2][2];
            matrixa[0][0] = 2;
            matrixa[0][1] = 4;
            matrixa[1][0] = 6;
            matrixa[1][1] = 8;

            int matrixb[][] = new int[2][2];
            matrixb[0][0] = 1;
            matrixb[0][1] = 3;
            matrixb[1][0] = 5;
            matrixb[1][1] = 7;

            for (int i = 0; i < matrixa.length; i++){
                for (int j = 0; j < matrixa[0].length; j++){
                    //menjumlahkan matrik a dengan matriks b
                    int elem = matrixa[i][j] + matrixb[i][j];
                    System.out.print( elem + " ");
                }
                System.out.println();
            }

    }
}
