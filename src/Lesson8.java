import java.util.Random;
import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args)
    {
        int triesNumber = 0;
        int random;
        int answer;

        Random rand = new Random();

        random = rand.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgadnij liczbę od 1 do 10!");

        do {
            triesNumber++;
            System.out.println("Podaj liczbę:");
            answer = scanner.nextInt();

            if (answer > random) System.out.println("Nie zgadłeś, moja liczba jest mniejsza");
            else if (answer < random) System.out.println("Nie zgadłeś, moja liczba jest większa");
        } while (answer != random);
        System.out.println("Brawo, odgadłeś za " + triesNumber + " razem!");
    }
}
