import java.util.HashMap;

public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<Integer, String> cities = new HashMap<Integer, String>();
        // Add:
        cities.put(1, "London");
        cities.put(2, "Berlin");
        cities.put(3, "New York");
        cities.put(4, "Tokyo");
        int length = cities.size();
        System.out.println("Hash Map Length = " + length); 
        System.out.println(cities);

        // Access item:
        System.out.println("cities[key=2] = " + cities.get(2));
        // Remove item:
        cities.remove(2); // Remove key=2.
        System.out.println("-> cities[key=2] = " + cities);
        System.out.println("cities = " + cities);
        cities.clear(); // Remove all items.
        System.out.println("Remove all: " + cities);

        HashMap<String, Integer> employee = new HashMap<String, Integer>();
        employee.put("Hoang Thai", 24);
        employee.put("Thai Hoang", 8);
        employee.put("Hoang Mai", 31);
        employee.put("Ha Tin", 14);
        // Loop using keySet()
        for (String key : employee.keySet()) {
            System.out.println("key: " + key + ", value: " + employee.get(key));
        }
        // Loop using values()
        for (Integer value : employee.values()) {
            System.out.println("value: " + value);
        }
    }
}
