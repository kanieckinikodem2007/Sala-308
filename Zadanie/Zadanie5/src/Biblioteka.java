import java.util.ArrayList;

public class Biblioteka {
private ArrayList ksiazki;

public Biblioteka() {
    ksiazki = new ArrayList<>();
}

public void dodajKsiazke(Ksiazka k) {
    ksiazki.add(k);
    System.out.println("Dodano książkę: " + k);
}

public void wyswietlWszystkie() {
    System.out.println("\n=== Spis książek w bibliotece ===");
    if (ksiazki.isEmpty()) {
        System.out.println("Biblioteka jest pusta.");
    } else {
        for (int i = 0; i < ksiazki.size(); i++) {
            System.out.println((i + 1) + ". " + ksiazki.get(i));
        }
    }
    System.out.println("Razem książek: " + ksiazki.size());
}
}
