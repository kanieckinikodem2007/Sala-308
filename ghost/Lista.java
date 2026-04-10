import java.util.ArrayList;
public class Lista {
 public static void main(String[] args) {
 // 1. Stwórz listę typu String o nazwie 'studenci' używając ArrayList
 ArrayList<String> studenci = new ArrayList <String>();
 // 2. Dodaj do listy trzy imiona: "Ania", "Tomek", "Alex"
 studenci.add("Ania");
 studenci.add("Tomek");
 studenci.add("Alex");
 // Wyświetlenie listy
 System.out.println("Lista studentów: " + studenci);
 }
}
