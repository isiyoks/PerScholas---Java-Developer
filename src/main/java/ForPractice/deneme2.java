package ForPractice;

import java.util.*;

public class deneme2 {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();
        hset.add("Apple");
        hset.add("Apple");
        hset.add("Orange");
        hset.add("");

        HashSet<String> hset2 = new HashSet<>();
        hset.add("Dog");
        hset.add("Cat");
        hset.add("Dog");
        hset.add("horse");

        System.out.println(hset);
        System.out.println(hset.size());

        HashSet<String>clonedHashSet= (HashSet<String>) hset.clone();
        HashSet<String> union = new HashSet<>(hset2);
        System.out.println("union = " + union);

        Iterator <String> iterator = hset.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+", ");
        }
        System.out.println("\ndeneme");

        ArrayList<String> names = new ArrayList<>();
        names.add("David");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("David");
        names.add("");
        names.add("null");

        System.out.println("------List------");
        System.out.println("names = " + names);
        System.out.println("names.size() = " + names.size());



        LinkedList<String> names2 = new LinkedList<>();
        names2.add("David");
        names2.add("Alice");
        names2.add("Bob");
        names2.add("Charlie");
        names2.add("David");
        names2.add("David");
        names2.add("");
        names2.add("null");

        System.out.println("------LinkedHashSet------");
        System.out.println("names = " + names2);
        System.out.println("names.size() = " + names2.size());

        LinkedHashSet<String> names3 = new LinkedHashSet<>();
        names3.add("David");
        names3.add("Alice");
        names3.add("Bob");
        names3.add("Charlie");
        names3.add("David");
        names3.add("David");
        names3.add("");
        names3.add("null");

        System.out.println("------LinkedHashSet------");
        System.out.println("names = " + names3);
        System.out.println("names.size() = " + names3.size());

        TreeSet<String> names4 = new TreeSet<>();
        names4.add("David");
        names4.add("Alice");
        names4.add("Bob");
        names4.add("Charlie");
        names4.add("David");
        names4.add("David");
        //names4.addAll(names);/names.add("");
        names4.add("");
        names4.add("null");

        System.out.println("------TreeSet------");
        System.out.println("names = " + names4);
        System.out.println("names.size() = " + names4.size());


    }
}