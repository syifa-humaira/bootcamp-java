package co.g2academy.io;

import java.io.FileOutputStream;

public class FileOutputStreamExample {


    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream(
                    "testout.txt");

            fout.write(65);
            String stringOut = " this is my first code to write file";
            fout.write(stringOut.getBytes());
            fout.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
            //handly, but not suggested in production code
            e.printStackTrace();
        }
    }
}
