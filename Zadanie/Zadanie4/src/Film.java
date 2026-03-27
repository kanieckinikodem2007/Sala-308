public class Film implements Odtwarzalny {
private String tytul;
private int czasTrwania;

public Film(String tytul, int czasTrwania) {
    this.tytul = tytul;
    this.czasTrwania = czasTrwania;
}

@Override
public void play() {
    System.out.println("Wyświetlam obraz... Film: " + tytul + " (" + czasTrwania + " min)");
}

@Override
public void stop() {
    System.out.println("Zatrzymano film: " + tytul);
}
}
