import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
ArrayList media = new ArrayList<>();

    media.add(new Film("Incepcja", 148));
    media.add(new Piosenka("Bohemian Rhapsody", "Queen"));
    media.add(new Film("Matrix", 136));
    media.add(new Piosenka("Imagine", "John Lennon"));

    System.out.println("=== Odtwarzanie mediów ===\n");
    for (Odtwarzalny m : media) {
        m.play();
        m.stop();
        System.out.println();
    }
}
}
