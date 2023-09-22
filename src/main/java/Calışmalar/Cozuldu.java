package Calışmalar;

import java.util.ArrayList;
import java.util.Scanner;

public class Cozuldu {

    public static void main(String[] args) {


          /*
        Kulanıcıdan alınan bir tam sayı kadar(47den kucuk olmak kosuluyla)
        FIBONACCI dizisi olusturun
        Ör: sayi=10 için
         0-1-1-2-3-5-8-13-21-34 gibi
        [0,1,2,3,4,5,6]

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int verilenSayi= input.nextInt();

     if (verilenSayi<=47){


         ArrayList<Integer>fibooldu=new ArrayList<>();

         fibooldu.add(0);
         fibooldu.add(1);



         for (int i = 0; i < verilenSayi-2; i++) {

             fibooldu.add(fibooldu.get(i+1)+fibooldu.get(i));

         }


         System.out.println("fibooldu = " + fibooldu);


     }else System.out.println("Sayınız 47 den büyük olamaz");


        
        
        
        }
        
    }










