package co.g2academy.Array;

public class perkalianMatriks {
        public static void main(String[] args) {
            int[][]arr1={{2,0},{4,9}};
            int[][]arr2={{1,3},{5,2}};
            perkalianMatriks.fungsiMatrix(arr1, arr2);
        }
        private static void fungsiMatrix(int[][]matrixA,int[][]matrixB){
            int[][]matrixC=new int[2][2];
            for (int i = 0; i < matrixC.length; i++) {
                for(int j=0;j<matrixC.length;j++){
                    matrixC[i][j]=0;
                    for(int k=0;k<matrixC.length;k++){
                        matrixC[i][j]+=matrixA[i][k]*matrixB[k][j];
                    }
                }
            }
            for (int i = 0; i < matrixC.length; i++) {
                for(int j=0;j<matrixC.length;j++){
                    System.out.print(matrixC[i][j]+" ");
                }
                System.out.println("");
            }
        }
}
