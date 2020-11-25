package co.g2academy.Array;

public class Vektor {
    private double x;
    private double y;
    private double z;

    //construktor 1
    Vektor(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;

    }

    //construktor 2
    Vektor(){

    }

    public Vektor tambah(Vektor b){
        Vektor temp=new Vektor();
        temp.x=b.x+x;
        temp.y=b.y+y;
        temp.z=b.z+z;
        return temp;
    }

    public Vektor kurang(Vektor b){
        Vektor temp=new Vektor();
        temp.x=x-b.x;
        temp.y=y-b.y;
        temp.z=z-b.z;
        return temp;
    }

    void display(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);

    }

}