import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class DenemeClass {


     /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */


    public static void main(String[] args) {

        ArrayList tutar=new ArrayList<>();

        tutar.add("$-13");
        tutar.add( "$0");
        tutar.add("$0");


       getSum(tutar);



        ArrayList<Integer> a =new ArrayList<>();
        a.add(12);
        a.add(17);

        ArrayList<Integer> b=a;



        b.add(15);

        a.add(0,10);


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        boolean  c=b.equals(a);

        System.out.println(c);


        ArrayList<Integer> d= (ArrayList<Integer>) b.clone();
        System.out.println("d = " + d);

        b.add(42);
        d.add(25);

        System.out.println(b);
        System.out.println(d);

        ArrayList<Integer> z =new ArrayList<>();

        ArrayList<Integer> y =z;

        z.add(15);
        z.add(12);
        y.add(10);

        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }

    private static void getSum(ArrayList<String> a) {

        int sum=0;


        for (String w :a) {
           String s= w.replace("$","");

            sum+=Integer.valueOf(s);

        }

       if (sum<0){

           System.out.println("Sonuç -1");
       }else System.out.println("sonuç   "+sum );
    }










}
