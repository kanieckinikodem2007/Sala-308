public class Main {
    public static void main(String[] args) {
        Pracownik p1 = new Programista("Jan", 8000, "Java");
        Pracownik p2 = new Menadzer("Anna", 9000, 2000);

        p1.wyswietl();
        p2.wyswietl();
    }
}

