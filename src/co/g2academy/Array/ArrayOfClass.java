package co.g2academy.Array;

public class ArrayOfClass {
    public char[] createArray() {
        char [] s = new char[26];
        for (int i = 0; i < 26; i++){
            s[i] = (char) ('A' +i);
        }
        return s;
    }
}
