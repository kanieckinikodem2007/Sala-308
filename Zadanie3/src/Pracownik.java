class Pracownik {
    String imie;
    double pensja;

    Pracownik(String imie, double pensja) {
        this.imie = imie;
        this.pensja = pensja;
    }

    void wyswietl() {
        System.out.println(imie + " zarabia " + pensja);
    }
}

