import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        // Add:
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        int length = cars.size();
        System.out.println("Array List Length = " + length); 
        System.out.println("cars = " + cars);

        // Access item:
        String getItem1 = cars.get(0);
        System.out.println("cars[0] = " + getItem1);

        // Change item:
        cars.set(0, "Opel");
        System.out.println("-> New cars[0] = " + cars);

        // Remove item:
        cars.remove(0); // Remove index=0.
        System.out.println("Single Remove: " + cars);
        cars.clear(); // Remove all items.
        System.out.println("Remove all: " + cars);

        ArrayList<Integer> myNumber = new ArrayList<Integer>();
        myNumber.add(30);
        myNumber.add(10);
        myNumber.add(20);
        // Loop through Array List with "for":
        System.out.print("myNumber = ");
        for (int i = 0; i < myNumber.size(); i++) {
            System.out.print(myNumber.get(i) + " ");
            myNumber.set(i, myNumber.get(i)/10);
        }
        System.out.print("\nmyNumber = ");
        // Loop through Array List with "for-each":
        for (Integer element : myNumber) {
            System.out.print(element + " ");
        }

        // Sort an Array List using Collections class:
        Collections.sort(myNumber);
        System.out.println("\nmyNumber After Sorting = " + myNumber);
    }
}
