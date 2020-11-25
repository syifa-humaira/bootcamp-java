package co.g2academy.basic;

public class thisDemo {

    int num;

    thisDemo(){
        System.out.println("This is and example program on keyword this ");
    }

    thisDemo(int num){
        //invoking the default const
        this();
        //assigning local variable num to the instance variable num
        this.num = num;
    }

    public void greet(){
        System.out.println("Hi welcome to JAVA");
    }

    public void print(){
        //local variable num
        int num = 20;
        //printing the local variable
        System.out.println("value of local variable num is : " +num);
        //printing the instance variable
        System.out.println("value of instance variable num is " + this.num);
        //invoking the greet method of class
        this.greet();
    }

    public static void main(String[] args) {
        //instantiating the class
        thisDemo obj1 = new thisDemo();
        //invoking the print method
        obj1.print();
        //passing a new value to the run variable through parametirized constructor
        thisDemo obj2 = new thisDemo(30);
        //invoking the print method again
        obj2.print();
    }
}
