package co.g2academy.Array;

import java.util.Scanner;

public class MatVektor {
    Scanner input = new Scanner(System.in);
    int h, k;

    int [] v1 = new int[3];
    int [] v2 = new int[3];
    int [] jumlah = new int[10];

    public void data () {
        System.out.println(" Vektor A = [ ");
        for (int i = 0; i < h; i++) {
            System.out.println(v1[i]);
            if (i!=h-1) {
                System.out.println(",");
            }
        }

        System.out.println("]");
        System.out.println("Vektor B = [");
        for (int i =0; i < h; i++) {
            System.out.println(v2[i]);
            if (i!=h-1) {
                System.out.println(",");
            }
        }
        System.out.println("]");
    }

    public void banyakdata() {
        System.out.println("Masukkan Jumlah Elemen Vektor = ");
        h = input.nextInt();

        System.out.println(" Vektor A");
        for (int i = 0; i < h; i++) {
            System.out.println("elemen [1, "+i+"] = ");
            v1[i] = input.nextInt();
        }
        System.out.println("Vektor B");
        for (int i = 0; i < h; i++) {
            System.out.println("elemen [1, "+i+"] = ");
            v2[i] = input.nextInt();
        }
    }

    public void penjumlahanVektor() {
        System.out.println("Vektor A + B = [ ");
        for (int i = 0; i < h; i++) {
            jumlah[i] = v1 [i]+ v2 [i];
            System.out.println(jumlah[i]);
            if (i!=h-1){
                System.out.println(",");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        MatVektor tampil = new MatVektor();
        tampil.banyakdata();
        tampil.data();
        tampil.penjumlahanVektor();
    }
}
