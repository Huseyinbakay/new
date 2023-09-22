package Calışmalar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HasMap {

    public static void main(String[] args) {


        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
//"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1


        String henry="Hello Henry!";
        String k=henry.replaceAll("[^A-Z,a-z]","");
        List<Character> hello=new ArrayList<>();

        System.out.println("henry.length() = " + henry.length());

        for (int i = 0; i <k.length() ; i++) {

            hello.add(k.charAt(i));

        }

        System.out.println(hello);

        HashMap<Character,Integer> ch=new HashMap<>();

        for (char w:hello) {

           Integer chnum=ch.get(w);

           if (chnum==null){

               ch.put(w,1);


           }else ch.replace(w,chnum+1);


        }

        System.out.println(ch);

    }
}
