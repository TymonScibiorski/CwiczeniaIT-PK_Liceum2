public class Product {
    public String nazwa;
    public double cena;
    public int kod;
    public int ilosc;


    Product(String nazwa, double cena, int kod, int ilosc) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kod = kod;

        if (ilosc > 0) { // nie może być niższa ilośc niż zero. Jak będzie, to ustawi się samo na zero
            this.ilosc = ilosc;
        }
    }

    Product(String nazwa, double cena, int kod) { // konstruktor dla którego nie ma ilości
        this.nazwa = nazwa;
        this.cena = cena;
        this.kod = kod;
        ilosc = 0;
    }


    public String draft() {
        return  "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", kod=" + kod +
                ", ilosc=" + ilosc;
    }
}