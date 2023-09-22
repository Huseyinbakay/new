package depoYonetim;

import java.util.Scanner;

import static depoYonetim.UrunService.*;

public class DepoRunner {



    public static void main(String[] args) {





        boolean isTrue;

        do {
            Scanner input =new Scanner(System.in);


            System.out.println();
            System.out.println("-------------------GELDİ GELİYOR DEPOSUNA HOŞGELDİNİZ----------------------");

            System.out.println();
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz\n1 Ürün Tanımlama   \n2 Ürün Giriş  \n3 Ürün çıkış \n4 Ürünü Rafa koy \n5 Ürün Listele \n6 Ürün arama \n7 Cıkış");
            int secim=input.nextInt();




            switch (secim){

                case  1:

                    urunTanimlama();

                    break;


                case 2:

                    urunGirisi();
                    System.out.println();
                    break;
                case 3:

                    urunCikisi();
                   break;
                case 4:

                    urunuRafaKoy();

                    break;
                case 5:

                    urunListele();
                    break;

                case 6:
                    urunArama();

                    break;

                case 7:
                    isTrue=false;


                    break;



                default:
                    System.out.println("Lütfen geçerli bir seçim yapınız.Tekrardan menüye yönlendiriliyorsunuz");

            }


        }while (true);







    }




}
