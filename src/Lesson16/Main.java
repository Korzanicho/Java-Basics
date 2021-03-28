package Lesson16;

public class Main {
    public static void main(String[] args)
    {
        int number = 50;
        System.out.println(number);
        change(number);
        System.out.println(number);

        Number objectNumber = new Number();
        Number objectNumber2 = objectNumber;
        objectNumber2.value = 35;
        System.out.println(objectNumber.value);
        change(objectNumber);
        System.out.println(objectNumber.value);
    }

    public static void change(int number)
    {
        number = -1;
    }

    public static void change(Number number)
    {
        number.value = -1;
    }
}
