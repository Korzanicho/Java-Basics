package Lesson19;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Animal cat1 = new Animal("Mruczek");
        Animal cat2 = new Animal("Rudolf");
        Animal cat3 = new Animal("Taco");

        ArrayList list = new ArrayList();
        list.add(cat1);
        list.add(cat2);
        list.add(cat3);

        System.out.println("-------------------");
        for (Object cat : list) {
            System.out.println(((Animal)cat).name);
        }
        System.out.println("-------------------");

        System.out.println(((Animal)list.get(1)).name);
        System.out.println(list.size());
        System.out.println(list.contains(cat1));
        System.out.println(list.contains(3));

        list.remove(1);

        System.out.println("-------------------");
        for (Object cat : list) {
            System.out.println(((Animal)cat).name);
        }
        System.out.println("-------------------");

        list.clear();
        System.out.println("-------------------");
        for (Object cat : list) {
            System.out.println(((Animal)cat).name);
        }
        System.out.println("-------------------");

        ArrayList<Animal> list2 = new ArrayList<Animal>();
        list2.add(cat1);
        list2.add(cat2);
        list2.add(cat3);

        System.out.println("-------------------");
        for (Animal cat : list2) {
            System.out.println(cat.name);
        }
        System.out.println("-------------------");
    }
}
