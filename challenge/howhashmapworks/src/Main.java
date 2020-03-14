import com.wonderingwall.challenge.Country;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        HashMap<People, String> peopleHashMap = new HashMap<>();
//        People people = new People("Alice");
//        People people1 = new People("John");
//        People people2 = new People("Lion");
//        People people3 = new People("David");

//        peopleHashMap.put(people, "Alice");
//        peopleHashMap.put(people1, "John");
//        peopleHashMap.put(people2, "Lion");
//        peopleHashMap.put(people3, "David");


        Country india = new Country("India", 1000);
        Country japan = new Country("Japan", 10000);
        Country france = new Country("France", 2000);
        Country russia = new Country("Russia", 20000);

        HashMap<Country, String> countryStringHashMap = new HashMap<Country, String>();
        countryStringHashMap.put(india, "Delhi");
        countryStringHashMap.put(japan, "Tokyo");
        countryStringHashMap.put(france, "Paris");
        countryStringHashMap.put(russia, "Moscow");

        Iterator<Country> countryIterator = countryStringHashMap.keySet().iterator();
        while (countryIterator.hasNext()) {
            Country peopleKey = countryIterator.next();
            String peopleValue = countryStringHashMap.get(peopleKey);

            System.out.println("PeopleKey:" + peopleKey + "|" + peopleKey.hashCode() + ", PeopleValue:" + peopleValue);
        }

        // System.out.println("0:" + (2 << 0));
        // System.out.println("1:" + (2 << 1));
        // System.out.println("2:" + (2 << 2));
        // System.out.println("3:" + (2 << 3));
        // System.out.println("4:" + (2 << 4));
        // System.out.println("5:" + (2 << 5));
        // System.out.println("6:" + (2 << 6));
        // System.out.println("7:" + (2 << 7));
    }
}
