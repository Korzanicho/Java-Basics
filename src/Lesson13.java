public class Lesson13 {
    public static void main(String[] args)
    {
        int a = 35000;
        short b = (short)a;
        String text = Integer.toString(b) + "tekst";
        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
