package Calışmalar;

import java.util.Scanner;

public class Ucakbileti {

 /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
 */




    public static void start(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gitmek istediğiniz şehri seciniz.\n B şehri için 1 \n C şehri için 2 \n D şehri için 3 e basınız");
        int city=scan.nextInt();
        System.out.println("Lütfen tarife seciniz \n 1 Tek Yön \n 2 Çift yön");
        int tarife = scan.nextInt();
        System.out.println("Lütfen yaşınızı giriniz");
        int yas=scan.nextInt();
        double totalFiyat;

        switch (city){

            case 1:

                if (tarife==1){
                   totalFiyat= yas<12?aToB()*0.5:yas>65? aToB()*0.7:aToB();
                    System.out.println("Bilet fiyatınız      :"+totalFiyat);

                }else {
                    totalFiyat= yas<12?aToB()*0.5:yas>65?aToB()*0.7:aToB();
                    totalFiyat=totalFiyat*2*0.8;//direk 1.6 ile de çarpabilirsin
                    System.out.println("Bilet fiyatınız      :"+totalFiyat);
                }
                break;

            case 2:

                if (tarife==1){
                   totalFiyat= yas<12?aToC()*0.5:yas>65?aToC()*0.7:aToC();
                    System.out.println("Bilet fiyatınız      :"+totalFiyat);
                    break;
                }else {
                    totalFiyat= (yas<12?aToC()*0.5:yas>65?aToC()*0.7:aToC());
                    totalFiyat=totalFiyat*2*0.8;
                    System.out.println("Bilet fiyatınız      :"+totalFiyat);
                }

            case 3:
                if (tarife==1){

                    totalFiyat=yas<12?aToD()*0.5:yas>65?aToC()*0.7:aToD();
                    System.out.println("Bilet fiyatınız      :"+totalFiyat);

                }else {
                    totalFiyat=(yas<12?aToD()*0.5:yas>65?aToC()*0.7:aToD());
                    totalFiyat=totalFiyat*2*0.8;
                    System.out.println("Bilet fiyatınız      :"+totalFiyat);
                }


            default:
                System.out.println("Lütfen geçerli bir değer giriniz");


        }




    }


    public static double aToB(){
        int a=500;
        return a*0.10;

    }

    public static double aToC(){
       int c=700;
        return c*0.1;
    }

    public static double aToD(){
        int d=900;
        return d*0.1;
    }



}
