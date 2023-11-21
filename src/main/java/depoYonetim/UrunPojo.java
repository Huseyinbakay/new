package depoYonetim;

public class UrunPojo {
        public static void main(String[] args) {


        }


        private int urunId;
        public static int count=99;

        private String urunIsmi;
        private String uretici;
        private int miktar;

        private String birim;

        private String raf;





    public UrunPojo(String urunIsmi, String uretici, String birim) {

            this.urunId=idAtama();
            this.urunIsmi = urunIsmi;
            this.uretici = uretici;
            this.birim = birim;

    }

    public  int idAtama(){
       urunId=count;
       count++;

       return urunId;


    }



    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }






    @Override
        public String toString() {
            return

                    ", urunIsmi='" + urunIsmi + '\'' +
                    ", miktar=" + miktar +
                    ", birim='" + birim + '\'' +
                    ", raf='" + raf + '\'' +
                    ", uretici='" + uretici + '\'' +
                    '}';
        }
    }

