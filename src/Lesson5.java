public class Lesson5 {
    public static void main(String[] args)
    {
        int age = 17;
        if (age >= 18) {
            System.out.println("Osoba pełnoletnia");
        } else {
            System.out.println("Zakazany dostęp");
        }

        String name = age >= 18 ? "Adrian" : "Adrianek";
        System.out.println(name);
    }
}
