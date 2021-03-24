public class Lesson3 {
    public static void main(String[] args)
    {
        int a = 25;
        int b = 10;

        double result = (double)a / b;  // dla b nastąpiło rzutowanie niejawne
        System.out.println(result);
        System.out.println((int)Math.pow(2, 3));
        System.out.println(Math.sqrt(9)); // pierwiastek kwadratowy
        System.out.println(Math.abs(-50)); // abstract - wartość bezwzględna
    }
}
