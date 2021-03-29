package Lesson17;

public class Main {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setSurname("Korzan");
        s1.setMark(3);
        s1.setMark(8);
        System.out.println(s1.getSurname());
        System.out.println(s1.getMark());
    }
}
