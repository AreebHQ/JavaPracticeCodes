package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {
    public static void main(String[] args) {
        // 1. Iterate through a HashMap EntrySet using Iterator
        Map< Integer, String > coursesMap = new HashMap< Integer, String >();
        coursesMap.put(1, "C");
        coursesMap.put(2, "C++");
        coursesMap.put(3, "Java");
        coursesMap.put(4, "Spring Framework");
        coursesMap.put(5, "Hibernate ORM framework");

        Iterator<Map.Entry< Integer, String >> iterator = coursesMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry< Integer, String > entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // 2. Iterate through HashMap KeySet using Iterator
        Iterator < Integer > iterator2 = coursesMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator2.next();
            System.out.println(key);
            System.out.println(coursesMap.get(key));
        }

        // 3. Iterate HashMap using For-each Loop
        for (Map.Entry < Integer, String > entry: coursesMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
// 4. Iterating through a HashMap using Lambda Expressions
        coursesMap.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });
        // 5. Loop through a HashMap using Stream API
        coursesMap.entrySet().stream().forEach((entry) -> {
                System.out.println(entry.getKey());
        System.out.println(entry.getValue());
        });
    }
}
