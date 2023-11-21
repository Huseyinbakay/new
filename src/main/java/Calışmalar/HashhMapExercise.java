package Calışmalar;

import java.util.*;

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


        System.out.println(words.repeat(8));


        String s="Hello Hennry";

        HashMap<String,Integer>map=new HashMap<>();

       String as= s.replaceAll("\\p{Punct}","");

        String [] arr =s.split("");

        for (String w:arr) {

            if(map.get(w)==null){
                map.put(w,1);

            }else map.replace(w,map.get(w)+1);

        }

        System.out.println(map);
        
        
        HashMap<String,Integer>books=new HashMap<>();
        
        books.put("History",20);
        books.put("Geograpy",12);
        books.put("Math",18);
        books.put("Music",6);
        books.put("Turkish",19);
        books.put("Chess",3);


        System.out.println("books = " + books);



        int sum=0;

        for (Integer w:books.values()) {

            sum+=w;
        }

        System.out.println("sum = " + sum);

        int sumLength=0;
        for (String each:books.keySet()) {

           sumLength+= each.length();
           
        }



        Scanner input=new Scanner(System.in);


        List<Integer>sayilar=Arrays.asList(1,2,3,4,5,6,5,4,3,6,7,8,7,8,8,9,15);
        List<Integer>benimList=new ArrayList<>();

        for (int w:sayilar) {

            if (benimList.contains(w)){

            }else {
                benimList.add(w);
            }

        }


        System.out.println(benimList);
        List<Integer>tersBebimList=new ArrayList<>();

        for (int i = benimList.size()-1; i>=0 ; i--) {
            tersBebimList.add(benimList.get(i));

        }
        System.out.println(tersBebimList);


        LinkedList<String> urunListesi=new LinkedList<>();
        int a=01;


        for (int i = 'A'; i <='Z' ; i++) {

            urunListesi.add( (char)i+""+a);

        }






        }

    }



        




        
        





