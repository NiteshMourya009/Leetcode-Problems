package Data_Structure_And_Algorithm.HasMap;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Create a HashMap using Java HashMap Class to store the following Pairs (Person, Age) and display them .
public class BasicsOf_Hashmap {
    static void HashMapMethod() {
        Map<String, Integer> mp = new HashMap<>();
        // Adding Element
        mp.put("Aakash", 25);
        mp.put("Yash", 16);
        mp.put("LAV", 17);
        mp.put("Rishika", 19);
        mp.put("Harse", 10);

        //Getting Valur of a key from the Hashmap
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Rahul"));

        // Changing/ Updating Value of a key in the HashMap ;
        mp.put("Aakash",30);
        System.out.println(mp.get("Aakash"));

        System.out.println(mp.remove("Aakash")); // remove 30

        // Checking if a key is in the HahMAp ;
        System.out.println(mp.containsValue("Aaksh"));
        System.out.println(mp.containsValue("Rishika"));

        // Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yashika", 40);
        mp.putIfAbsent("Rishika",50);

        // Get all Values in the HashMap
        System.out.println(mp.keySet());

        // Get all values in the HashMap
        System.out.println(mp.values());

        // Get all entries (keys and values) in the Hashmap
        System.out.println(mp.entrySet());

        // Traversing all entries of Hashmap - multiple method
        for (String key: mp.keySet() ) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
        // Another Method to traverse ;
        for(Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();
        // Another Method
        for (var e: mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey() , e.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapMethod();
    }
}