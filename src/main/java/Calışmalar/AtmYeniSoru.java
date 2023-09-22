package Calışmalar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtmYeniSoru {


    /*ATM
    Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
    Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
            Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

           Bakiye sorgula , para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

            Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
    Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
            Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,*/
    static String cardNo = "1234567890";
    static int sifreGecerli = 12345;
    static int bakiye = 15000;
    static List <Integer> iban=new ArrayList<>();

    static int gonderilen(int b){

        return b;
    }





    public static int paraYatirma(int a){

        return bakiye+a;
    }

    public static int paraCekim(int a){
        return bakiye-a;
    }


    public static int paraGonderme(int a){
        return bakiye-a;
    }


    public AtmYeniSoru() {


    }

    public static void atmSoru() {
        do

        {

            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen kart numaranısı giriniz");
            String kartNo = input.nextLine().replaceAll(" ", "");
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen sifrenizi giriniz.");
            int sifre = scan.nextInt();

            if (cardNo.equals(kartNo) && sifreGecerli == sifre) {

                System.out.println("Bakiye sorgula için 1 e        " + "para yatirma için 2 ye           " + "para çekme  için 3 e      " + "para gönderme için 4 e       " + "sifre değiştirme için 5 e      " + "cikis için 6 yı tuşlayınız");

                Scanner secimm = new Scanner(System.in);
                System.out.println("Lütfen yapmak istediğiniz islemi secin");
                int secim = secimm.nextInt();

                switch (secim) {

                    case 1:
                        System.out.println(bakiye);
                        break;

                    case 2:
                        Scanner yatir = new Scanner(System.in);
                        System.out.println("Lütfen yatırmak istediğiniz miktarı giriniz");
                        int yatirilan = yatir.nextInt();
                        System.out.println("Bakiyeniz      " + (bakiye + yatirilan));
                        continue;

                    case 3:
                        Scanner cek = new Scanner(System.in);
                        System.out.println("Lütfen çekmek istediğiniz tutarı giriniz");
                        int cekilen = cek.nextInt();
                        String a = (cekilen < bakiye) ? "Bakiyeniz     " + (bakiye = bakiye - cekilen) : "Bakiyeden büyük çekim yaılamaz;";
                        System.out.println(a);
                        break;
                    case 4:




                    case 5:

                        break;


                    case 6:

                        break;


                }//switch


            }else System.out.println("Kart no ya da şifre hatalı");


        }while(true);



    }



}













