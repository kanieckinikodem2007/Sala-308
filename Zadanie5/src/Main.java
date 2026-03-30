public class Main {
    public static void main(String[] args) {
        Biblioteka b = new Biblioteka();

        b.dodajKsiazke(new Ksiazka("Wiedzmin", "Sapkowski"));
        b.dodajKsiazke(new Ksiazka("Hobbit", "Tolkien"));
        b.dodajKsiazke(new Ksiazka("1984", "Orwell"));

        b.wyswietlWszystkie();
    }
}

