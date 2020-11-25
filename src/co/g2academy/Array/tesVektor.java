package co.g2academy.Array;

import java.util.Random;

public class tesVektor {
    public static void main(String[] args) {

        // TODO code application logic here

        Vektor v1 = new Vektor(5, 3, 9);
        Vektor v2 = new Vektor(3, 2, 5);
        Vektor v3 = new Vektor();
        Vektor v4 = new Vektor();
        v3 = v1.tambah(v2);
        v4 = v1.kurang(v2);

        System.out.println("penjumlahan antara  ");
        v3.display();
        System.out.println("pengurangan ");
        v4.display();
    }
}

