public Pracownik(String imie, double pensja) {
    this.imie = imie;
    this.pensja = pensja;
}

public void wyswietlInfo() {
    System.out.println("Imię: " + imie);
    System.out.println("Pensja: " + pensja + " zł");
}
