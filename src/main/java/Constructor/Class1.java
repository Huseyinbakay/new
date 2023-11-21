package Constructor;

public class Class1 {

    private String isim="Hasan";

    private String yazar;

    private int sayfa;

    private String tasarım;

    private String kapak;

    public Class1(String isim, String yazar, int sayfa) {
        this.isim = isim;
        this.yazar = yazar;
        this.sayfa = sayfa;
    }


    public Class1(String yazar, String tasarım, String kapak) {
        this.yazar = yazar;
        this.tasarım = tasarım;
        this.kapak = kapak;
    }



    public String getIsim() {
        return isim;
    }

    public String getYazar() {
        return yazar;
    }

    public int getSayfa() {
        return sayfa;
    }

    public String getTasarım() {
        return tasarım;
    }

    public String getKapak() {
        return kapak;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public void setSayfa(int sayfa) {
        this.sayfa = sayfa;
    }

    public void setTasarım(String tasarım) {
        this.tasarım = tasarım;
    }

    public void setKapak(String kapak) {
        this.kapak = kapak;
    }

    public void oku(){

        System.out.println("Kitap okumak güzeldir");
    }

    public void yaz(){

        System.out.println("Okudukça haayl dünyan gelişir");
    }

    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                ", yazar='" + yazar + '\'' +
                ", sayfa=" + sayfa +
                ", tasarım='" + tasarım + '\'' +
                ", kapak='" + kapak + '\'' +
                '}';
    }
}
