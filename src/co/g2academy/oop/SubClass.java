package co.g2academy.oop;

public class SubClass extends SuperClass{
    int num = 10;
    public void display(){
        System.out.println("This is the display method of subclass");
    }
    
    public void myMethod(){
        this.display();
        super.display();
        System.out.println("value of the variable named num is SubClass: "+this.num);
        System.out.println("value of the variable named num is SuperClass: "+super.num);
    }

    public static void main(String[] args) {
        new SubClass().myMethod();
    }
}
