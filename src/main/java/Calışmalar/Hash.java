package Calışmalar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {

       String a="Allah Cezanı versin Tayyip!";

      String [] bArr= a.replaceAll("[^A-Za,a-z]","").split("");
        System.out.println(Arrays.toString(bArr));
        HashMap<String,Integer>elementsOfNumber=new HashMap<>();
        for (String w:bArr) {
            if(!elementsOfNumber.containsKey(w)){

                elementsOfNumber.put(w,1);

            }else {

                elementsOfNumber.replace(w,elementsOfNumber.get(w)+1);
            }
        }


        System.out.println(elementsOfNumber);

       Set<Map.Entry<String,Integer>>mapConverterSet= elementsOfNumber.entrySet();

        System.out.println(mapConverterSet);

        System.out.println("mapConverterSet.size() = " + mapConverterSet.size());

    }
}
