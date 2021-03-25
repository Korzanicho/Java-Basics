public class Lesson9 {
    public static void main(String[] args)
    {
//        String[] students = new String[5];
//        students[0] = "Adrian";
//        students[1] = "Klaudia";
//        students[2] = "Artur";
        String[] students = {"Adrian", "Klaudia", "Artur", "Kamil", "Daniel"};

        System.out.println(students[0]);
        System.out.println(students.length);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
