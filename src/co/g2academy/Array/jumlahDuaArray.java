package co.g2academy.Array;

public class jumlahDuaArray {
        public static void main(String[] args) {
// TODO code application logic here
            int[] data1={2,4,6,8};
            int[] data2={2,4,6,8};
            int jum,i,j,x=0;
            System.out.println(" +   2   4   6   8");
            System.out.println(" ———————");
            for(i=0; i<=3; i++){
                x=x+2;
                System.out.print(" "+x);
                for(j=0; j<=3; j++){

                    jum=data1[i]+data2[j];
                    System.out.print("      " +jum);
                }
                System.out.println("");
            }
        }
}
