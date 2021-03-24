import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Podaj imię: ");
        name = scanner.nextLine();
        System.out.print("Hello " + name);
    }
}
