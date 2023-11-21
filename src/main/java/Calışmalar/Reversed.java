package Calışmalar;

import java.util.Arrays;
import java.util.Scanner;

public class Reversed {
    /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak


		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin*/

      public static Scanner inp=new Scanner(System.in);
    public static void main(String[] args) {


        String sSitring ="All is well";
        String reverse="";

        for (int i =sSitring.length()-1; i >=0; i--) {
            reverse+= sSitring.charAt(i);

        }
        System.out.println("reverse = " + reverse);


        StringBuilder ham=new StringBuilder("All is well");

        System.out.println("ham.reverse() = " + ham.reverse());

        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen birşeyler yazınız");
        String verilen=inp.nextLine();
        tersString(verilen);

       // isPalindrom();

        charaBol();


    }

    public static void tersString(String a){

        String b="";

        for (int i =a.length()-1; i >=0 ; i--) {

            b+=a.charAt(i);
        }
        System.out.println("Verdiğiniz verinin tersi    "+b);
    }


    public static void isPalindrom(){
        System.out.println("Lütfen sayınızın palindrom olup olmadığını öğrenmek için bir sayi girinız");
        String sayi=inp.nextLine();

        String s="";

        for (int i =sayi.length()-1; i >=0 ; i--) {

            s=s+sayi.charAt(i);

        }

        System.out.println(s.equals(sayi) ? "Sayınız palindrom" : "Sayınız palindrom değil");
    }

    public static void charaBol(){
        System.out.println("Lütfen karakterlerine ayırmak istediğiniz veriyi giriniz");

        String s1=inp.nextLine();

        String [] s=s1.split("");

        Arrays.stream(s).distinct().forEach(t-> System.out.print(t+""));





    }




}
