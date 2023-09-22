package Calışmalar;

import java.util.Arrays;

public class MethodAdd {

    public static void main(String[] args) {

bolme(44,4);


        String ad=isim("Hasan iyidir");
        System.out.println(ad);

        
        double carpmaSonuc=carpmayap(8,9,5.5,42,0.05);
        System.out.println("carpmaSonuc = " + carpmaSonuc);



        bolme22(125,77);



        str("Hasan","Kemal","Kagan","Halime","Çiçek");




    }//777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777


    public static void bolme22(double c, double d){
        System.out.println(c/d);

    }

    public static String isim(String a){
        return a;

    }

 private static double carpmayap(double...f){
   double sum=0;
     for (double w:f) {
         sum=sum+w;

     }
     return sum;
 }



 protected static void bolme(int d, int k){
     System.out.println(d/k);
 }


 static void str(String...a){
     System.out.println(Arrays.toString(a));

     }



}//77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777


