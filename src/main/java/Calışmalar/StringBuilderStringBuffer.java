package Calışmalar;

public class StringBuilderStringBuffer {
    public static void main(String[] args) {

        StringBuilder scan=new StringBuilder("alooooooo");


        System.out.println(scan);
scan.append("efendim");


        System.out.println(scan);


       String Sscan= scan.toString();

       StringBuilder yenidenSbf=new StringBuilder("Java is easy");

        System.out.println(yenidenSbf.reverse());

     String tekrarStr=yenidenSbf.toString();
     String ters="";
        System.out.println(tekrarStr);

        for (int i = tekrarStr.length()-1; i>=0; i--) {
            
            char ch=tekrarStr.charAt(i);
            String chStr=String.valueOf(ch);
            
            ters=ters.concat(chStr);
        }

        System.out.println("ters = " + ters);
    }
}
