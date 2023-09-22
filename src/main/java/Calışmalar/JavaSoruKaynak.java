package Calışmalar;

import java.util.ArrayList;
import java.util.List;

public class JavaSoruKaynak  {
    public static void main(String[] args) {

        List <Integer> sayilar=new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);
        sayilar.add(11);
        sayilar.add(15);

        int sum =0;

        for (int w:sayilar) {
            sum=sum+w*w;

        }
        System.out.println("sum = " + sum);


    }
}
