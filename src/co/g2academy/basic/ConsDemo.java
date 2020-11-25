package co.g2academy.basic;

public class ConsDemo {

    public static void main(String[] args) {
        //class object => inisialisasi class menjadi object lewat new keyword
        //dan kontruktor
        //Class adalah blue print / template
        //object adalah inisialisasi dari class
        //object is initialitation of a Class
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(20);
        MyClass t3 = new MyClass("35");

        System.out.println(t1.x + " " + t2.x +" "+ t3.x);
    }
}
