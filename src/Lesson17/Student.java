package Lesson17;

public class Student {
    private String surname;
    private Integer mark;

    String getSurname()
    {
        return "Nazwisko: " + this.surname;
    }

    void setSurname(String surname)
    {
        this.surname = surname;
    }

    Integer getMark()
    {
        return this.mark;
    }

    void setMark(Integer mark)
    {
        if (mark >= 1 && mark <= 6) {
            this.mark = mark;
        }
    }
}
