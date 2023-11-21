package Calışmalar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylisElemanSilme {
    public static void main(String[] args) {

        //Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.

        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        r.add("Edirne");
        System.out.println(r);//[Manisa, Nigde, Tokat, Van]

        for (int i = 0; i <r.size() ; i++) {

            if (r.get(i).endsWith("e")){
                r.remove(i);
                i--;
            }else {
                System.out.println(r.get(i));
            }

        }


        System.out.println(r);


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(15);
        nums.add(95);

        Collections.sort(nums);
        System.out.println("nums.get(nums.size()-1) = " + nums.get(nums.size() - 1));
        System.out.println("nums.get(0) = " + nums.get(0));



         double sum=0;
        for (int w:nums) {
           sum+=w;

        }
        System.out.println(sum/nums.size());


        for (int i = 0; i <nums.size() ; i++) {

            if(nums.get(i)%10==5){

                nums.remove(i);
                i--;

            }

        }
        System.out.println(nums);
    }
}
