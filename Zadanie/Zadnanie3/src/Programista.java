public Programista(String imie, double pensja, String jezykProgramowania) {
    super(imie, pensja);
    this.jezykProgramowania = jezykProgramowania;
}

@Override
public void wyswietlInfo() {
    super.wyswietlInfo();
    System.out.println("Stanowisko: Programista");
    System.out.println("Język programowania: " + jezykProgramowania);
}
