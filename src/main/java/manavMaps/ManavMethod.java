package manavMaps;

import java.util.HashMap;
import java.util.Scanner;

public class ManavMethod extends MavavListesi {

    public static void main(String[] args) {


        //

        manavim();



    }


    public static void manavim() {
        double toplam = 0;
        Scanner input = new Scanner(System.in);
        HashMap<String,Double> sebzeler=new HashMap<>();

        sebzeler.put("domates",10.99);
        sebzeler.put("patlıcan",12.99);
        sebzeler.put("kivi",22.99);
        sebzeler.put("biber",29.99);
        sebzeler.put("marul",24.99);
        sebzeler.put("muz",49.99);
        sebzeler.put("elma",24.99);
        sebzeler.put("çilek",59.99);
        sebzeler.put("karpuz",9.99);
        sebzeler.put("kavun",14.99);
        sebzeler.put("kiraz",null);
        sebzeler.put("avokado",null);
        sebzeler.put("patates",null);
        sebzeler.put("soğan",null);

        System.out.println("--------------------------MEMNUNLAR MANAVINA HOŞGELMİŞSİZZZ\"--------------------------");
        System.out.println();
        System.out.println();
        System.out.println();




        boolean karar;

        do {


            System.out.println("Ne vereyim ablama");
            String fruitVagetable = input.next().toLowerCase();

            if (arrList.contains(fruitVagetable)) {

                if (sebzeler.get(fruitVagetable)==null){
                    System.out.println("Abla yarın gelecek");
                }else {
                    System.out.println();
                }

            }else {
                System.out.println("Abla öyle şeyler bizde yoğdir");
            }


            switch (fruitVagetable) {

                case "patlıcan":
                    System.out.println("Abla kaç kilo");
                    int kiloPat = input.nextInt();
                    System.out.println(sebzeler.get("patlıcan") * kiloPat);

                    break;
                case "kivi":

                    System.out.println("Abla kaç kilo");
                    int kilokivi = input.nextInt();
                    System.out.println(sebzeler.get("kivi") * kilokivi);
                    break;
                case "biber":

                    System.out.println("Abla kaç kilo");
                    int kiloBiber = input.nextInt();
                    System.out.println(sebzeler.get("biber") * kiloBiber);
                    toplam+=sebzeler.get("biber") * kiloBiber;

                    break;
                case "marul":
                    System.out.println("Abla kaç tane");
                    int adetMarul = input.nextInt();
                    System.out.println(sebzeler.get("marul") * adetMarul);

                    toplam+=sebzeler.get("marul") * adetMarul;
                    break;

                case "muz":
                    System.out.println("Abla kaç kilo");
                    int kiloMuz = input.nextInt();
                    System.out.println(sebzeler.get("muz") * kiloMuz);
                    toplam+=sebzeler.get("muz") * kiloMuz;

                    break;
                case "elma":
                    System.out.println("Abla kaç kilo");
                    int kiloElma = input.nextInt();
                    System.out.println(sebzeler.get("elma") * kiloElma);

                    toplam+=sebzeler.get("elma") * kiloElma;
                    break;
                case "çilek":

                    System.out.println("Abla kaç kilo");
                    int kiloCilek = input.nextInt();
                    System.out.println(sebzeler.get("çilek") * kiloCilek);

                    toplam+=sebzeler.get("çilek") * kiloCilek;


                    break;
                case "karpuz":

                    System.out.println("Abla kaç kilo");
                    int kiloKarpuz = input.nextInt();
                    System.out.println(sebzeler.get("karpuz") * kiloKarpuz);

                    toplam+=sebzeler.get("karpuz") * kiloKarpuz;
                    break;
                case "kavun":

                    System.out.println("Abla kaç kilo");
                    int kiloKavun = input.nextInt();
                    System.out.println(sebzeler.get("kavun") * kiloKavun);

                    toplam+=sebzeler.get("kavun") * kiloKavun;
                    break;

                case "domates":
                    System.out.println("Abla kaç kilo");
                    int kiloDomates = input.nextInt();
                    System.out.println(sebzeler.get("domates")*kiloDomates);
                    toplam+=sebzeler.get("domates")*kiloDomates;

                    break;



            }
                boolean karar2;
            do {

                Scanner scan=new Scanner(System.in);
                System.out.println("Abla başka birşey var mıydı");

                String cevap=scan.next().toLowerCase();
                if (cevap.equals("hayır")||cevap.equals("yok")){
                    karar=false;
                    karar2=false;
                }else if (cevap.equals("evet")){
                    karar=true;
                    karar2=false;
                } else{
                    System.out.println("Abla anlamadım");
                    karar=true;
                    karar2=true;
                }
            }while (karar2);



        } while (karar);

         toplam+=toplam;
        System.out.println("Abla borcun    :"+toplam + "  TL");
        System.out.println("Ablam kart mı nakit mi");
        String kartNakit=input.next().toLowerCase();
        if (kartNakit.equals("nakit")){

            toplam=toplam*0.9;
            System.out.println("Abla nakit e indirim var.Borcun     :"+toplam+"    TL");
        }else System.out.println("Abla borcun    :"+toplam + "  TL");

    }

}