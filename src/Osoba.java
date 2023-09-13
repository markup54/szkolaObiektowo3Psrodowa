public abstract class Osoba {
    //klasa abastrakcyjna nie pozwala na tworzenie jej obiektów
    //można tylk wykorzystać ją do dziedziczenia
    private String imie;
    private int wiek;

    public Osoba() {
        imie="Edek";
        wiek =80;
    }
    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }



    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek<0) {
            this.wiek = 0;
        }
        else {
            this.wiek = wiek;
        }
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
