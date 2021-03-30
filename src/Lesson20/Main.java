package Lesson20;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<>(); // dla większych kolekcji
        list.add("Poznań");
        list.add("Warszawa");
        list.add("Warszawa");
        list.add("Kraków");

        list.remove(0);
        for (String e : list) {
            System.out.println(e);
        }
        list.clear();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Poniedziałek");
        map.put(3, "Sroda");
        map.put(5, "Piątek");

        System.out.println(map.get(5));

        for (String e : map.values()) {
            System.out.println(e);
        }

        HashSet<String> list2= new HashSet<>(); // unikalne wartości
        list2.add("Warszawa");
        list2.add("Kraków");
        list2.add("Gniezno");
        list2.add("Gniezno");

        for (String e : list2) {
            System.out.println(e);
        }
    }
}
