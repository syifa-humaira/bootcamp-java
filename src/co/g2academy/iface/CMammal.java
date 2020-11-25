package co.g2academy.iface;

public class CMammal implements IAnimal{


    @Override
    public void eat() {
        System.out.println("Mammal Eats");
    }

    @Override
    public void travel() {
        System.out.println("Mammal Travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String[] args) {
        CMammal mammal = new CMammal();
        mammal.eat();
        mammal.travel();
    }
}
