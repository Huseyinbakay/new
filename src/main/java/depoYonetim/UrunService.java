package depoYonetim;

import java.util.*;

public class UrunService {
    public static void main(String[] args) {

UrunService yeni=new UrunService();



    }
    public static HashMap<Integer, UrunPojo> liste = new HashMap<>();
    UrunPojo urun1=new UrunPojo();




    static void urunArama() {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen aramak istediğiniz ürünün ID numarasını giriniz");
        int id=input.nextInt();

        System.out.println(liste.get(id));
    }



   public UrunService() {

      urunTanimlama();


   }

    static void urunCikisi() {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen çıkıç yapmak istediğiniz urunID giriniz");
        int urunID=input.nextInt();

        if (liste.containsKey(urunID)){
            System.out.println("Lütfen miktar giriniz");
            int exit=input.nextInt();


            int adet=liste.get(urunID).getMiktar();


            if (exit>adet){
                System.out.println("Depoda çıkış yapmak istediğiniz miktarda ürün yok.");
                System.out.println("Çıkış yapmak istediğin üründen depoda  "+liste.get(urunID).getMiktar()+"  tane var");

            }else liste.get(urunID).setMiktar(adet-exit);

        }else System.out.println("Çıkış yapmak istediğiniz ürün listede yok");


    }

    static void urunuRafaKoy() {




        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ürün ID giriniz");
        int id=input.nextInt();
        liste.get(99).setRaf("A");





        int rafSayi=1;
        List<Character> raf=new ArrayList<>();







        }



/*
        raf.add("A");
        raf.add("B");
        raf.add("C");
        raf.add("D");
        raf.add("E");
        raf.add("F");
        int rafSayi=1;
        liste.get(99).setRaf("A");
        boolean rafVarmi=liste.get(id).getRaf()==null;
        boolean miktar=liste.get(id).getMiktar()>50;


        if (!rafVarmi){

            for (String w:raf) {



                if (liste.get(id).getRaf().equals(w)){

                    if (miktar){
                        liste.get(id).setMiktar(liste.get(id).getMiktar()-50);
                        liste.get(id).setRaf(liste.get(id).getRaf()+w+rafSayi++);

                    }else
                        liste.get(id).setRaf(liste.get(id).getRaf());
                }else {

                    liste.get(id).setRaf(w);
                }

            }
            rafSayi++;

        }else {

            System.out.println();

            }
        */








        /*int raf1=1;
        int i =0;
        String a="";
        String b=raf.toString();

        if (liste.containsKey(id)){

            if (liste.get(id).getRaf()==null){


                liste.get(id).setRaf(b.charAt(i)+raf1+a);
                i++;

            }else {
                liste.get(id).setRaf(String.valueOf(liste.get(id).getRaf().indexOf(0)+raf1++));
            }


        }else {
            System.out.println();

        }
        */


    static void urunGirisi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen eklemek istediğiniz ürünün ID giriniz");
        int id = input.nextInt();
        if (liste.containsKey(id)){


            System.out.println("Lütfen girmek istediğiniz miktarı giriniz");
            int miktar = input.nextInt();
            int a =liste.get(id).getMiktar();
            liste.get(id).setMiktar(miktar+a);


        }else {
            System.out.println("Ürünü tanımladıktan sonra giriş yapabilirsiniz.Lütfen önce ürünü tanımlayınız");
        }




    }

    static void urunTanimlama() {


        Scanner input = new Scanner(System.in);


            System.out.println("Lütfen ürün ismi giriniz");

            String isim = input.next();
            System.out.println("Lütfen üretici firmayı giriniz");
            String uretici = input.next();
            System.out.println("Lütfen birim giriniz");
            String birim = input.next();

            UrunPojo urunler=new UrunPojo(isim,uretici,birim);

            liste.put(urunler.getUrunId(),urunler);




        }




    static void urunListele() {
        Set<Map.Entry<Integer, UrunPojo>> liste1=liste.entrySet();

        System.out.println("UrunID  "+"       Urunİsmi"+"       Miktar"+"      Birim"+"          Raf"+"        Uretici");


        liste1.stream().forEach(t-> System.out.println("   "+t.getKey()+"              "+t.getValue().getUrunIsmi()+"        "+t.getValue().getMiktar()+"             "+t.getValue().getBirim()+"          "+t.getValue().getRaf()+"       "+t.getValue().getUretici()) );
    }
}