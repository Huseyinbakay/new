package Calışmalar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaKaynak {
    public static void main(String[] args) {

         /*
        - Bir kütüphane yönetimi uygulaması geliştiriyorsunuz.

        - Kullanıcılar, kütüphaneye yeni kitap ekleyebilmeli, kitapları sıralayabilmeli ve
        - kitapları kütüphaneden silebilmelidir.
        - Ayrıca, kullanıcılara kütüphaneyi tamamen sıfırlama seçeneği de sunmanız isteniyor.

       */

        List <String> kutuphanem=new ArrayList<>();

        do {
            Scanner input=new Scanner(System.in);
            System.out.println("Lütfen Kitap eklemek için 1,Kitap silmek için 2,Kütüphaneyi silmek için  3 ye basınız");

            int karar=input.nextInt();

            switch (karar){

                case 1:
                    do {
                        System.out.println("Lütfen eklemek istediğiniz kitap isimlerini giriniz.Bitirmek için B ye  basınız");

                        String kitapAdi=input.nextLine();
                        if(kitapAdi.equals("B"))
                            break;
                        kutuphanem.add(kitapAdi);
                        kutuphanem.remove("");

                    }while (true);

                    Collections.sort(kutuphanem);
                    System.out.println("Kitaplığınız           :"+kutuphanem);
                    break;


                    case 2:

                    Scanner scan=new Scanner(System.in);
                    System.out.println("Lütfen silmek istediğiniz kitap ismini giriniz");

                    String silinenisim=scan.nextLine();
                        kutuphanem.remove(silinenisim);

                    System.out.println("Kitaplığınız          :"+kutuphanem);
                     break;



                case 3:
                    Scanner karar2=new Scanner(System.in);
                    System.out.println("Emin misiniz");
                    String sonKarar=karar2.nextLine();
                    sonKarar.toLowerCase();
                    if (sonKarar.equals("evet")){

                        kutuphanem.removeAll(kutuphanem);
                        kutuphanem.add("boş");
                        System.out.println("Kitaplığınız     :"+kutuphanem);

                    }else  System.out.println(kutuphanem);

            }
        }while (true);

}
}
