package Constructor;

public class Class2 extends Class1 {
    public Class2(String isim, String yazar, int sayfa) {
        super(isim, yazar, sayfa);
    }

    public Class2(String yazar, String tasarım, String kapak) {
        super(yazar, tasarım, kapak);
    }

    public static void main(String[] args) {
        Class2 kitap=new Class2("ali piknikte","Sahin Erdem",48);

        Class1 kitap1=new Class1("Ali piknikte","sahin Erdem",48);

        System.out.println("kitap1 = " + kitap1);

        System.out.println(kitap);

        System.out.println("kitap1.getIsim() = " + kitap1.getIsim());

        kitap.oku();
        kitap.yaz();




    }


    @Override
    public void oku() {
        System.out.println("Ali Canı okumak güzeldir");
        super.oku();
    }

    @Override
    public void yaz() {
        System.out.println("Ali can hayal dünyanı geliştirir");
        super.yaz();
    }
}
