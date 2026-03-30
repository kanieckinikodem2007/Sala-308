public class Piosenka implements Odtwarzalny {
private String tytul;
private String wykonawca;

public Piosenka(String tytul, String wykonawca) {
    this.tytul = tytul;
    this.wykonawca = wykonawca;
}

@Override
public void play() {
    System.out.println("Gram muzykę... Piosenka: " + tytul + " - " + wykonawca);
}

@Override
public void stop() {
    System.out.println("Zatrzymano piosenkę: " + tytul);
}
}
