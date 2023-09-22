package Calışmalar;

import java.util.HashMap;

public class HashhMapExercise {

    public static void main(String[] args) {

        String words="I like you! like like, to you.";

        String Words=words.replaceAll("\\p{Punct}","");

        System.out.println(Words);

       String[] arrWords = Words.split(" ");

        HashMap<String,Integer>sayKelimeSayisi=new HashMap<>();

        for (String  w:arrWords) {

            if (sayKelimeSayisi.get(w)==null){
                sayKelimeSayisi.put(w,1);

            }else sayKelimeSayisi.replace(w,sayKelimeSayisi.get(w)+1);

        }

        System.out.println(sayKelimeSayisi);



    }
}
