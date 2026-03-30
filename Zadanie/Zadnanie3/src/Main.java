import java.until.ArryList;

public class Main{
	public static void main(String[] args){
		ArryList<Pracownik> pracownicy = new ArryList<>();
pracownicy.add(new Programista("Anna Nowak", 8000, "Java"));
    pracownicy.add(new Menadzer("Jan Kowalski", 10000, 3000));
    pracownicy.add(new Programista("Piotr Wiśniewski", 7500, "Python"));
    pracownicy.add(new Menadzer("Maria Zielińska", 12000, 4000));

    System.out.println("Lista pracowników:");
    for (Pracownik p : pracownicy) {
        p.wyswietlInfo();
        System.out.println("---------------------");
    }
}
