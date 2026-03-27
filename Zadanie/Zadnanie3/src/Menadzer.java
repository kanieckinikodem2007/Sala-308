public Menadzer(String imie, double pensja, double premia) {
    super(imie, pensja);
    this.premia = premia;
}

@Override
public void wyswietlInfo() {
    super.wyswietlInfo();
    System.out.println("Stanowisko: Menadżer");
    System.out.println("Premia: " + premia + " zł");
    System.out.println("Łączne wynagrodzenie: " + (pensja + premia) + " zł");
}
