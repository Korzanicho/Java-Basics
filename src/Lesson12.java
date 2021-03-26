public class Lesson12 {
    public static void main(String[] args)
    {
        int[] y = {5};
        change(y);
        System.out.println(y[0]); //10 - typy złożone, przekazujemy referencję
    }

    public static void change(int[] x)
    {
        x[0] += 5;
    }
}
