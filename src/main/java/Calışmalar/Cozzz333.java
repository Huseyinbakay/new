package Calışmalar;

public class Cozzz333 {
    public static void main(String[] args) {

        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli
                                                            //dönmeli diyor ise onun retur y void olmuyor.Yeni bir yere assign et.

        double cel =fahreneit(140);

        System.out.println("cel = " + cel);

    }

    private static double fahreneit(double f) {

        return (f-32)/1.8;
    }


}
