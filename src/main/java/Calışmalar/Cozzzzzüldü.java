package Calışmalar;

public class Cozzzzzüldü {
    public static void main(String[] args) {


        /*Bir okuldaki ogrencilerden ders secmesi isteniyor.
        Alınann ders saati sayısının 12'yi gecmemesi isteniyor.
        Buna gore;
        Asagida ders saatleri verilen derslerden istediginiz kadar secin.
        Sectiginiz bu derslerin saatleri toplamı 12'yi gecerse "Limiti astiniz";
        12'yi gecmezse "Islem basariyla tamamlandi" mesajini veren bir method olusturunuz*/


        int Matematik =4;
        int Geometri  =5;
        int Fizik  =2;
        int Kimya  =3;
        int Biyoloji = 5;
        int Edebiyat =2;
        int Tarih = 2;
        int  Cografya=2;



        dersSaatiSecimi(Matematik,Edebiyat,Tarih,Biyoloji);

    }

    private static void dersSaatiSecimi(int...a) {


        int sum=0;
        for (int w:a) {

            sum=sum+w;
        }

        if (sum>12){
            System.out.println("Ders saati toplamı gecildi");
            System.out.println("Ders saati Toplamı   :"+sum);
        } else if (sum==12) {

            System.out.println("Ders seçimi başarıyla gerçekleştşrildi");

            System.out.println("Ders saati Toplamı   :"+sum);
        }else System.out.println("Ders saatiniz tamamalnamadı");
    }


}
