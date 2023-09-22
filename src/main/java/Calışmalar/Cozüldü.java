package Calışmalar;

import java.util.Arrays;
import java.util.Scanner;

public class Cozüldü {
    public static void main(String[] args) {

         /*
        arr[3][2] luk bir mdarray olusturun
        Arrayın elemanlarını kullanıcıdan alın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int [][] arr={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */


 int [][] array=new int[3][2];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j <array[i].length ; j++) {

                Scanner input= new Scanner(System.in);
                System.out.println("sayıları giriniz");
               int verilenSayi= input.nextInt();
               array[i][j]=verilenSayi;
                
            }
            
        }

        System.out.println("array = " + Arrays.deepToString(array));

        int [] tek= new int[6];
        int i=0;
        for (int [] w:array) {

            for (int k:w) {

                tek[i]=k;
             i++;

            }

        }
        System.out.println(Arrays.toString(tek));

    }

}
