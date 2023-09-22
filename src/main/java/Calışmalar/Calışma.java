package Calışmalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calışma {


/*
    Soru 5) Asagidaki multi dimensional array'in
    ic array'lerindeki son elemanlarin carpimini ekrana yazdiran
    bir program yaziniz {{1,2,3}, {4,5}, {6}}
    */

 /*

    soru 7) Verilen bir multi dimensional array'in
    inner indexindeki elementlerinin ortalamasından
    büyük elementleri yazdıran bir kod yazınız.
     */

    public static void main(String[] args) {

        int sum =1;
        int [][] a={{1,2,3}, {4,5}, {6}};

        for (int [] w:a){

            Arrays.sort(w);//Bu senaryoda gerek yok ama alışkanlık olsun

            sum*=w[w.length-1];
            }

        System.out.println("sum = " + sum);


        for (int i = 0; i <45 ; i++) {
            System.out.print("-");

        }


        int [][] b={{1,2,3}, {4,5}, {6}};
       List<Integer> z=new ArrayList<>();
        int toplam=0;
        double ort=0;

        for (int [] w:b) {

            for (int k:w) {

                toplam+=k;

            }

            ort=toplam/ w.length;

            for (int x:w) {

                if (x>ort){
                    z.add(x);

                }

            }
            toplam=0;
            ort=0;

        }


        System.out.println(z);


    }


    }





