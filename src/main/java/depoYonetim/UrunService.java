package depoYonetim;

import java.util.*;

public class UrunService extends DepoRaff{



    public static void main(String[] args) {

    }



    public static HashMap<Integer, UrunPojo> liste = new HashMap<>();

     static DepoRaff deporr=new DepoRaff();

    private static Scanner scan=new Scanner(System.in);


















    static void urunArama() {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen aramak istediğiniz ürünün ID numarasını giriniz");
        int id=input.nextInt();

        System.out.println(liste.get(id));
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

    public static void urunuRafaKoy(){

        System.out.println("Lütfen rafa yerleştirmek istediğiniz ürün id giriniz");

        int id=scan.nextInt();


        if (liste.get(id).getRaf()==null){

            for (int i = 0; i <newRaf.size(); i++) {
                liste.get(id).setRaf(newRaf.get(i));
                newRaf.remove(newRaf.get(newRaf.size()-1));

                }


        }else {
            String b=liste.get(id).getRaf().split("")[1];
            int bc=Integer.valueOf(b);
            String aa=liste.get(id).getRaf().split("")[0];

            liste.get(id).setRaf(liste.get(id).getRaf()+","+aa+(bc+1));

        }



        System.out.println(newRaf);
    }



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


        liste1.stream().forEach(t-> System.out.println("   "+t.getKey()+"              "+t.getValue().getUrunIsmi()+"        "+t.getValue().getMiktar()+"             "+t.getValue().getBirim()+"          "+t.getValue().getRaf()+"       "+t.getValue().getUretici()));

    }


}