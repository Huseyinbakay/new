package Calışmalar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class cozuldü {
    public static void main(String[] args) {


        /*
        Ali 29.10.1923 tarihinden 45 yıl 8 ay 5 gun sonra dogdu.
        Veli  15.09.1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
        Ali ve Veli'nin dogum tarihini hesaplayıp yazdırınız.
        Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız
         */


      LocalDate alininki=LocalDate.of(1923,10,29);
      LocalDate aliSimdi=alininki.plusYears(45).plusMonths(8).plusDays(5);
        System.out.println("aliSimdi = " + aliSimdi);

     LocalDate velininki=LocalDate.of(1993,9,15);
     
     LocalDate veliSimdi=velininki.minusYears(24).minusMonths(2).minusDays(11);
        System.out.println("veliSimdi = " + veliSimdi);


        DateTimeFormatter dtr1=DateTimeFormatter.ofPattern("dd/MMM/yy");
        System.out.println("dtr1.format(alininki) = " + dtr1.format(alininki));

        if (aliSimdi.equals(veliSimdi)){

            System.out.println("Aynılar");
        }else System.out.println("Aynı değiller");


        
        
        
         /*
        Ali 29.10.1923 tarihinden 45 yıl 8 ay 5 gun sonra dogdu.
        Veli  15.09.1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
        Ali ve Veli'nin dogum tarihini hesaplayıp yazdırınız.
        Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız
         */
        
        
        LocalDate dogumAli=LocalDate.of(1923,10,29).plusMonths(8).plusDays(5).plusYears(45);

        System.out.println("dogumAli = " + dogumAli);

        System.out.println("dogumAli.getDayOfWeek() = " + dogumAli.getDayOfWeek());

        DateTimeFormatter dtr21=DateTimeFormatter.ofPattern("dd--MMM--yy");
        System.out.println("dtr21.format(dogumAli) = " + dtr21.format(dogumAli));

       LocalDate tokyo =LocalDate.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("tokyo = " + tokyo);
        
        
        
        LocalTime tokyoSaat=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("tokyoSaat = " + tokyoSaat);


        DateTimeFormatter dtrtokyo=DateTimeFormatter.ofPattern("HH" + "mm");
        System.out.println("dtrtokyo.format(tokyoSaat) = " + dtrtokyo.format(tokyoSaat));
    }





}
