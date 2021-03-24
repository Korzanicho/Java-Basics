public class Lesson7 {
    public static void main(String[] args)
    {
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        for (int j = 0; j <= 5; j++) {
            System.out.println(j);
        }
        for (; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
