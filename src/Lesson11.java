public class Lesson11 {
    public static void main(String[] args) {
        System.out.println(show());
        System.out.println(add());
        System.out.println(add(5));
        System.out.println(add(5, 7));
    }

    static String show() {
        return "Hej";
    }

    static int add() {
        return 0;
    }

    static int add(int numberOne) {
        return ++numberOne;
    }

    static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
}
