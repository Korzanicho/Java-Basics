package Lesson15;

public class Person {
    String name;
    static Integer countPeople = 0;

    Person()
    {
        name = "Anonim";
        countPeople++;
    }

    Person(String name)
    {
        this.name = name;
        countPeople++;
    }
}
