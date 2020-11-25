package co.g2academy.basic;

public class trial{
    int jumlah;
    int populasi1 = 200;
    int populasi2 = 100;

    public int jumlah(){
        jumlah = populasi1 - populasi2;
        return jumlah;
    }

    public static void main(String args[]){
        trial t = new trial();

        System.out.println(t.jumlah());
    }
}