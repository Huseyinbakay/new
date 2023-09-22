package Calışmalar;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Tarihler {
    public static void main(String[] args) {


        LocalDate tarihSimdi=LocalDate.now();
        System.out.println("tarihSimdi = " + tarihSimdi);


        LocalDate gecmisZaman=LocalDate.of(2000,01,01);

        System.out.println(tarihSimdi.isAfter(gecmisZaman));

        System.out.println(tarihSimdi.isBefore(gecmisZaman));

        LocalDateTime tarihSaat=(LocalDateTime.now());

   DateTimeFormatter dtr=DateTimeFormatter.ofPattern("dd/MMM/yyy,***hh,mm");

        System.out.println(dtr.format(tarihSaat));
        
        
        LocalDate gecmisZaman2=LocalDate.of(2005,11,25);
        
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MMM///yyyy");
        
        
       String düzenlenmis= format.format(gecmisZaman2);
        System.out.println("düzenlenmis = " + düzenlenmis);


        LocalTime saat=LocalTime.of(12, 25, 07);
        
        LocalDate wifeBirthDay=LocalDate.of(1989,9,28);

        DayOfWeek bridday=wifeBirthDay.getDayOfWeek();

        System.out.println("bridday = " + bridday);

        Month tarih=wifeBirthDay.getMonth();
        System.out.println("tarih = " + tarih);
        System.out.println("wifeBirthDay.getYear() = " + wifeBirthDay.getYear());

    }
    
}
