public class Main {
public static void main(String[] args) {
Biblioteka biblioteka = new Biblioteka();

    biblioteka.dodajKsiazke(new Ksiazka("Wiedźmin: Ostatnie życzenie", "Andrzej Sapkowski"));
    biblioteka.dodajKsiazke(new Ksiazka("Rok 1984", "George Orwell"));
    biblioteka.dodajKsiazke(new Ksiazka("Mały Książę", "Antoine de Saint-Exupéry"));

    biblioteka.wyswietlWszystkie();
}
}
