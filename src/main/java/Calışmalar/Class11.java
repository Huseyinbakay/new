package Calışmalar;

public class Class11 {


    int yil=2005;
    int oda=4;

    String renk="mavi";


    @Override
    public String toString() {
        return "Class11{" +
                "yil=" + yil +
                ", oda=" + oda +
                ", renk='" + renk + '\'' +
                '}';
    }

    public Class11(int yil, int oda, String renk) {
        this.yil = yil;
        this.oda = oda;
        this.renk = renk;
    }


    }



