package Calışmalar;

import java.util.Arrays;

public class Eylül08 {

    public static void main(String[] args) {


        int a[]={1,2,3,4,5,6,7,8,};
        System.out.println("a.length = " + a.length);

        int b [][]={{1,2,3},{4,5,6},{7,8}};
        System.out.println("b.length = " + b.length);


        System.out.println("b[0][1] = " + b[0][1]);

        System.out.println("b[1] = " +Arrays.toString(b[2]) );


        String jaz="Java is not very easy";


        System.out.println("jaz.contains(\"er\") = " + jaz.contains("er"));

        String [] arr=jaz.split(" ");

        System.out.println(Arrays.toString(arr));

        System.out.println("arr.length = " + arr.length);


        System.out.println("jaz.toLowerCase() = " + jaz.toLowerCase());

        System.out.println("jaz = " + jaz);

        System.out.println("jaz.indexOf(e) = " + jaz.indexOf("e"));

        System.out.println("jaz.lastIndexOf(\"e\") = " + jaz.lastIndexOf("e"));

        String zaj="";
        for (int i = jaz.length()-1; i>=0; i--) {

            zaj=zaj+jaz.charAt(i);

        }

        System.out.println("zaj = " + zaj);

        StringBuilder str=new StringBuilder(zaj);

       str.reverse();
        System.out.println("str = " + str);

       String str1= str.toString();
        String str2=str1.split("is")[1];

        System.out.println("str2 = " + str2);

        String str3=str2.substring(str2.indexOf("s"));

        System.out.println("str3 = " + str3);

        System.out.println("str2.charAt(5) = " + str2.charAt(5));

        System.out.println("str2.contains(\"w\") = " + str2.contains("w"));



    }




}
