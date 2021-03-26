package Lesson14;

public class Animal {
    String name;
    String voice = "Grrry!";
    static Integer count = 0;

    public void Animal()
    {
        count++;
    }

    public void getVoice(int iteration)
    {
        for (int i = 0; i <= iteration; i++){
            System.out.print(voice);
            System.out.print(" ");
        }
        System.out.println();
    }

    public void getName()
    {
        System.out.println("Jestem " + name);
    }
}
