package Calışmalar;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        //kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin



        int sayi =65;
        int sayac=0;

        do {

            Scanner input=new Scanner(System.in);
            System.out.println("Lütfen 1 ve 100 arasında 5 in katı bir sayı giriniz");
            int tahmin=input.nextInt();
if (sayac==5){
    break;
}

            if (tahmin==sayi){

                System.out.println("Tebrikler,tahminniz doğru");
                break;

            } else if (sayi!=tahmin) {
                System.out.println("Lütfen ekrar deneyin");

            } else if (sayi<0||sayi>100) {
                System.out.println("Ben sana 1 ile 100 arası demedim mi");

            }
               sayac++;

        }while (true);




    }

}
