package Calışmalar;

import java.util.ArrayList;
import java.util.Scanner;

public class Cozzzuldu {
    public static void main(String[] args) {

// Verilen bir array'den tekrar eden elemanları silip
        // tekrarsız elemanlardan olusan bir array haline donusturun

         int aarr[]={1,2,2,3,4,4,5};


        ArrayList<Integer>brr=new ArrayList<>();

        for (int i = 0; i <aarr.length ; i++) {


             int sayi=aarr[i];


             if (!brr.contains(sayi)){

                 brr.add(sayi);




             }

            }

        System.out.println(brr);


           int sum=0;

        do {

            if (sum==5){

                System.out.println("Fazlasıyla sayı girdiniz");
                break;


            }

            Scanner input=new Scanner(System.in);
            System.out.println("Palinrom sayı ları girin");
            int a =input.nextInt();



            String aStr=String.valueOf(a);
            String cStr="";

            for (int i =aStr.length()-1; i >=0; i--) {

                char ch=aStr.charAt(i);

                cStr=cStr+ch;

            }

            if (aStr.equals(cStr)){

                System.out.println("Sayınız palindrom");
            }else System.out.println("Sayi palindrom değil");

            sum++;

        }while (true);


    }

    }



