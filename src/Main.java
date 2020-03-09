import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj zdanie: ");
        String sentence = scan.nextLine();

        if (sentence.length() == 0) {
            System.out.println("Wpisz zdanie jeszcze raz.");
            sentence = scan.nextLine();
            System.out.println(sentence);
        } else {
            Random r = new Random();
            String[] parts = sentence.split(" ");
            for (int i = 0; i < parts.length; i++) {
                System.out.print(parts[r.nextInt(parts.length)] + " ");
            }
        } //no i chuj cześć czapka nie działą
        System.out.println("\nPodaj zdanie w odpowiedniej kolejnosci:");
        String correct = scan.nextLine();
        if (correct == parts) {
            System.out.println("Brawo udalo ci się dobrze ulozyc.");
        } else {
            System.out.println("Sprobuj jeszcze raz.");
        }
    }
}