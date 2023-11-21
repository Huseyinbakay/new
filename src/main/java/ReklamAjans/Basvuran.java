package ReklamAjans;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basvuran {
  private static Scanner input=new Scanner(System.in);
   static List<Basvurucu>isimListe=new ArrayList<>();

   public static void basvran(){
       System.out.println("Basvuran isim");
       String isim=input.nextLine();
       System.out.println("Basvuran yaş");
       int yas=input.nextInt();
       System.out.println("Başvuran Boy");
       double boy=input.nextDouble();
       System.out.println("Saç Rengi");
       String saç=input.nextLine();
       input.next();
       System.out.println("Başvuran göz rengi");
       String göz=input.nextLine();

        Basvurucu obj1=new Basvurucu(isim,yas,boy,göz,saç);

        isimListe.add(obj1);
    }


}
