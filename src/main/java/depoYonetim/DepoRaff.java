package depoYonetim;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DepoRaff {

static ArrayList<String> newRaf = new ArrayList<>();
    public DepoRaff() {


        for (int i = 'A'; i <= 'Z'; i++) {

            for (int j = 1; j < 2; j++) {

                newRaf.add((char) i + "" + j);

            }
        }
    }

    public  ArrayList reffffffffff(){

        return newRaf;
    }
}
