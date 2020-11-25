package co.g2academy.basic;

public class MyClass {
    int x;

    MyClass() {
        x = 10;
    }

    MyClass(int a){
        x = a;
    }

    MyClass(String s){
        x = Integer.parseInt(s);
    }
}
