import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * How to iterator HashMap in Java.
 * @author DavidZou  -- wearecisco@gmail.com
 *
 */
public class IterateHashMapExample {
    public static void main(String[] args) {

        Map < Integer, String > coursesMap = new HashMap < Integer, String > ();
        coursesMap.put(1, "Java");
        coursesMap.put(2, "C");
        coursesMap.put(3, "Python");
        coursesMap.put(4, "C++");
        coursesMap.put(5, "C#");
        coursesMap.put(6, "Visual Basic .NET");
        coursesMap.put(7, "JavaScript");
        coursesMap.put(8, "PHP");
        coursesMap.put(9, "SQL");
        coursesMap.put(10, "GO");

        System.out.println("TIOBE Index for March 2020: ");

        if (args != null && args.length > 0 && args[0] !=null) {
            switch(args[0]) {
                case "1":
                    iterateByEntrySet(coursesMap);
                    break;
                case "2":
                    iterateByKeySet(coursesMap);
                    break;
                case "3":
                    iterateByForEach(coursesMap);
                    break;
                case "4":
                    iterateByLambda(coursesMap);
                    break;
                case "5":
                    iterateByStreamAPI(coursesMap);
                    break;
            }
        } else {
            System.out.println("Please type param 1 to 5.");
        }
    }


    public static void iterateByEntrySet(Map < Integer, String > coursesMap) {
        // 1. Iterate through a HashMap EntrySet using Iterator
        Iterator < Entry < Integer, String >> iterator = coursesMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry < Integer, String > entry = iterator.next();
            System.out.print(entry.getKey() + ". ");
            System.out.println(entry.getValue());
        }
    }

    public static void iterateByKeySet(Map < Integer, String > coursesMap) {
        // 2. Iterate through HashMap KeySet using Iterator
        Iterator < Integer > iterator = coursesMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.print(key + ". ");
            System.out.println(coursesMap.get(key));
        }
    }

    public static void iterateByForEach(Map < Integer, String > coursesMap) {
        // 3. Iterate HashMap using For-each Loop
        for (Map.Entry < Integer, String > entry: coursesMap.entrySet()) {
            System.out.print(entry.getKey() + ". ");
            System.out.println(entry.getValue());
        }
    }

    public static void iterateByLambda(Map < Integer, String > coursesMap) {
        // 4. Iterating through a HashMap using Lambda Expressions
        coursesMap.forEach((key, value) -> {
            System.out.print(key + ". ");
            System.out.println(value);
        });
    }

    public static void iterateByStreamAPI(Map < Integer, String > coursesMap) {
        // 5. Loop through a HashMap using Stream API
        coursesMap.entrySet().stream().forEach((entry) -> {
            System.out.print(entry.getKey() + ". ");
            System.out.println(entry.getValue());
        });
    }
}
