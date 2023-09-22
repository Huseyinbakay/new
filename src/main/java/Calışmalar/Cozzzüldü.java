package Calışmalar;

import java.util.Scanner;

public class Cozzzüldü {
    public static void main(String[] args) {


          /*
        Basit 4 islem yapan bir hesap makinesi kodlayınız
        Kullanıcıcn yapacagi islemi islem sembolu ile( +  -  /  *  ) secmesini isteyiniz
        Kullanıcının 2 sayi girmesini isteyiniz
        Girilen islem ve sayilara gore dogru sonucu ekrana yazdırınız*/


        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen yapmak istediğiniz işlemi yazınız ( +  -  /  *  ) " );
        char islem=input.next().charAt(0);


        if (islem=='+'||islem=='/'||islem=='-'||islem=='*'){
            System.out.println("Lütfen 1.sayıyı giriniz");
            double sayi1= input.nextInt();

            System.out.println("Lütfen 2. sayıyı giriniz");
            double sayi2 =input.nextInt();

          hesapMAkinesi(islem,sayi1,sayi2);



        }else
        System.out.println("Lütfen geçerli bir karakter giriniz");


    }

    public static void hesapMAkinesi(char islem, double sayi1, double sayi2) {

        switch (islem){


            case '*':
                System.out.println(sayi1*sayi2);
                break;
            case '+':
                System.out.println(sayi1+sayi2);
                break;
            case '-':
                System.out.println(sayi1-sayi2);
                break;
            case '/':
                System.out.println(sayi1/sayi2);







        }


    }


}



        



