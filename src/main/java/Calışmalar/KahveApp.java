package Calışmalar;

import java.util.Scanner;

public class KahveApp {



    public static void main(String[] args) {

        boolean isTrue;

do {

    Scanner input = new Scanner(System.in);
    System.out.println(" \"Hangi Kahveyi istersiniz?");
    System.out.println(" 1 Türk Kahvesi \n 2 Expresso\n 3 Filtre Kahve");
    String hangiKahve = input.nextLine().toLowerCase();

    boolean kahveCesit = hangiKahve.equals("türk kahvesi") ||
            hangiKahve.equals("expresso") || hangiKahve.equals("filtre kahve");

    if (kahveCesit) {
        System.out.println(hangiKahve + "        hazırlanıyor...");

        System.out.println("Süt eklememizi ister misiniz?(Evet ya da hayır olarak cevaplayın)");
        String süt=input.next().toLowerCase();

        sut(süt);
        System.out.println("Şeker ister misiniz?(Evet veya hayır cevabını veriniz) ");
        String seker=input.next().toLowerCase();
        seker(seker);

        boyut();

        System.out.println("Afiyet olsun...");

        isTrue=false;

    } else{
        System.out.println("Hatalı tuşlama yaptınız");

        isTrue=true;

    }

}while (isTrue);


    }






    public static void sut(String sut){
        if (sut.equals("evet")){

            System.out.println("Süt ekleniyor...");

        }else System.out.println("Süt eklenmiyor");

    }

    public static void seker(String seker){

        if (seker.equals("evet")){

            System.out.println("Kaç seker olsun");
            Scanner scan=new Scanner(System.in);
            int kacSeker=scan.nextInt();

            System.out.println(kacSeker + scan.nextLine()+"    Şeker  ekleniyor...");

        }else System.out.println("Şeker eklenmiyor");


    }
    public static void boyut(){
        Scanner input=new Scanner(System.in);
        System.out.println("\"Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");
        String s=input.nextLine().toLowerCase();


        if (s.equals("büyük")){
            ;
            System.out.println("Kahveniz    " + s + "   boy   hazırlanıyor.");

        } else if(s.equals("orta")) {

            System.out.println("Kahveniz    " + s + "     boy  hazırlanıyor.");
        }else if (s.equals("küçük")){
            System.out.println("Kahveniz    " + s + "     boy    hazırlanıyor.");
        }else {
            System.out.println("Lütfen kahve boyunu tekrar giriniz");
        }


    }




}