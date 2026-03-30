import java.util.ArrayList;

class Biblioteka {
    ArrayList<Ksiazka> lista = new ArrayList<>();

    void dodajKsiazke(Ksiazka k) {
        lista.add(k);
    }

    void wyswietlWszystkie() {
        for (Ksiazka k : lista) {
            System.out.println(k.tytul + " - " + k.autor);
        }
    }
}

