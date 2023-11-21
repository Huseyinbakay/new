package ReklamAjans;

public class Basvurucu {

   private String isim;
  private int yas;
    private double boy;

    private String gozRengi;
    private String sacRengi;
    private boolean deneyim;
   private int maasBeklentisi;

    public Basvurucu(String isim, int yas, double boy, String gozRengi, String sacRengi) {
        this.isim = isim;
        this.yas = yas;
        this.boy = boy;
        this.gozRengi = gozRengi;
        this.sacRengi = sacRengi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yaş) {
        this.yas = yas;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public String getGozRengi() {
        return gozRengi;
    }

    public void setGozRengi(String gozRengi) {
        this.gozRengi = gozRengi;
    }

    public String getSacRengi() {
        return sacRengi;
    }

    public void setSacRengi(String sacRengi) {
        this.sacRengi = sacRengi;
    }

    public boolean isDeneyim() {
        return deneyim;
    }

    public void setDeneyim(boolean deneyim) {
        this.deneyim = deneyim;
    }

    public int getMaasBeklentisi() {
        return maasBeklentisi;
    }

    public void setMaasBeklentisi(int maasBeklentisi) {
        this.maasBeklentisi = maasBeklentisi;
    }

    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                ", yaş=" + yas +
                ", boy=" + boy +
                ", gozRengi='" + gozRengi + '\'' +
                ", sacRengi='" + sacRengi + '\'' +
                ", deneyim=" + deneyim +
                ", maasBeklentisi=" + maasBeklentisi +
                '}';
    }
}
