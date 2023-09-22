package Calışmalar;

import java.util.Scanner;

public class Kelimeoyunu {

    public static void main(String[] args) {


        /* Iki kisinin oynayacagi bir kelime oyunu uretelim
         * Kurallar
         * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
         *        ve 3.adima gecin
         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
         *        kazandigini yazip oyunu bitirin
         *
         * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
         *          basa mi sona mi ekleyecegini sorun
         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         *      *   Devam etmek istemezse
         *          "Oyun bitti" yazin
         *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
         */


        int puan1=0;
        int puan2=0;


        do {
            Scanner input=new Scanner(System.in);
            System.out.println("1.oyuncu Lütfen bir kelime giriniz");
            String kelime1=input.next();
            System.out.println("Girilen kelime      "+kelime1);



            Scanner scan=new Scanner(System.in);
            System.out.println("2. oyuncu kelimeyi kabul ediyor mu?");
            String karar2=scan.next().toLowerCase();

            if (karar2.equals("evet")){
                puan1=puan1+kelime1.length();
                System.out.println("1.oyuncu puanı    :"+puan1);

                Scanner kelimeKarar=new Scanner(System.in);
                System.out.println("2.oyuncu devam etmek istiyor mu?");
                String kelimeEvetHayir=kelimeKarar.next();


                if (kelimeEvetHayir.equals("hayır")){
                    break;
                }else {

                }

                System.out.println("2.oyuncu yeni kelimeyi sona mı başa mı eklemek istiyor");
                Scanner ekle=new Scanner(System.in);
                String sonBas=ekle.next().toLowerCase();
                System.out.println("2.Oyuncu lütfen kelime girin");
                Scanner kelime22=new Scanner(System.in);
                String kelime2=kelime22.next();
                if (sonBas.equals("baş")){
                    System.out.println(kelime2.concat(kelime1));

                    puan2=puan2+kelime2.concat(kelime1).length();

                    System.out.println("2.Oyuncu puan   :"+puan2);

                }else if (sonBas.equals("son")){

                    System.out.println(kelime1.concat(kelime2));

                    puan2=puan2+kelime1.concat(kelime2).length();

                    System.out.println("2.Oyuncu puan   :"+puan2);

                }else {
                    System.out.println("Lütfen geçerli bir kelime giriniz");
                }

            }else {
                System.out.println("Geçersiz kelime.Bu eli Önceki oyuncu kazandı");

                break;
            }
            Scanner tamamDevam=new Scanner(System.in);
            System.out.println("Oyuna devam etmek isteniyor mu");

            String tamamDevamKarar=tamamDevam.next();


           if (tamamDevamKarar.equals("hayır")){

               break;
           }


        }while (true);

        System.out.println("1.Oyuncu puanı    :"+puan1);
        System.out.println("2.oyuncu puanı     :"+puan2);
        if (puan2>puan1){

            System.out.println("Tebrikler 2.Oyuncu kazandın");

        }else System.out.println("Tebrikler 1. oyuncu kazandın");












    }
}
