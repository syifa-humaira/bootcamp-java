package co.g2academy.basic;

public class IfElse {
    public static void main(String[] args) {
        int nilai= 85;
        char grade;

        if (nilai >=90) {
            grade = 'A';
        } else if (nilai <=85){
            grade = 'B';
        } else if (nilai <=75){
            grade = 'C';
        } else if (nilai <= 55){
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Gradenya adalah " + grade);
    }
}
