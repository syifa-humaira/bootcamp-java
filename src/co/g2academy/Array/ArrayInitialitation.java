package co.g2academy.Array;

import co.g2academy.basic.MyDate;

public class ArrayInitialitation {

    private String[] names;
    private String[] simpleNames = {"Giorgino", "Jen","Simon"};

    private MyDate[] dates;
    private MyDate [] simpleDate = {
            new MyDate(22,7,1964),
            new MyDate(1,1,2000),
            new MyDate(22,12,1964)
    };

    public ArrayInitialitation() {
        names = new String[3];
        names[0] = "Giorgino";
        names[1] = "Jes";
        names[2] = "Simon";

        dates = new MyDate[3];
        dates[0] = new MyDate(22, 7, 1964);
        dates[1] = new MyDate(1,1,2000);
        dates[2] = new MyDate(22, 12, 1964);
    }


    public String[] getNames() {
        return names;
    }

    public String[] getSimpleNames() {
        return simpleNames;
    }

    public MyDate[] getSimpleDates() {
        return simpleDate;
    }

    public MyDate[] getDates() {
        return dates;
    }
}
