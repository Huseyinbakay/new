package Calışmalar;

import java.util.Arrays;

public class HarftenKaçtaneVar {

    public static void main(String[] args) {
        kacAdetVar("ali kemal bugün okula gelmedi");
    }

    public static void kacAdetVar(String s){

      String []s1=s.split("");
        Arrays.sort(s1);
        int count=1;
        for (int i =1; i < s1.length-1; i++) {
            if (s1[i].equals(s1[i-1])) {

                System.out.print(s1[i]+"="+count++);

            }else System.out.print(s1[i]+count);
            count=0;
        }






    }
}
