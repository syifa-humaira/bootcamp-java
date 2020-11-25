package co.g2academy.Array;

import java.awt.*;

public class ArrayOfPoint {

    public Point[] createArray() {
        Point[] p = new Point[10];
        for (int i = 0; i < p.length; i++) {
            p[1] = new Point(i, i + 1);
        }
        return p;
    }
}
