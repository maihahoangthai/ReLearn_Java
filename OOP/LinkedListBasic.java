import java.util.LinkedList;
import java.util.Collections;

public class LinkedListBasic {
    // Array List dùng cho mục đích lưu trữ và truy cập data, còn Linked List dùng để tương tác và thao tác với data.
    // Linked List có đầy đủ các Method của Array List. 
    // Ngoài ra, Linked List còn có thêm một số Method đặc trưng, ví dụ: addFirst, addLast, getLast, removeFirst, v.v.
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        // Add:
        cars.add("Ferrari");
        cars.addFirst("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.addLast("Mazda");
        int length = cars.size();
        System.out.println("Linked List Length = " + length); 
        System.out.println("cars = " + cars);

        // Access item:
        System.out.println("cars[1] = " + cars.get(1));
        System.out.println("cars[0] = " + cars.getFirst());
        System.out.println("cars[4] = " + cars.getLast());

        // Change item:
        cars.set(0, "Opel");
        System.out.println("-> New cars[0] = " + cars);

        // Remove item:
        cars.remove(1); // Remove index=1.
        System.out.println("Index=1 Remove: " + cars);
        cars.removeLast();
        System.out.println("Last Index Remove: " + cars);
        cars.removeFirst();
        System.out.println("First Index Remove: " + cars);
        cars.clear(); // Remove all items.
        System.out.println("Remove all: " + cars);

        LinkedList<Integer> myNumber = new LinkedList<Integer>();
        myNumber.add(30);
        myNumber.add(10);
        myNumber.add(20);
        // Loop through Linked List with "for":
        System.out.print("myNumber = ");
        for (int i = 0; i < myNumber.size(); i++) {
            System.out.print(myNumber.get(i) + " ");
            myNumber.set(i, myNumber.get(i)/10);
        }
        System.out.print("\nmyNumber = ");
        // Loop through Linked List with "for-each":
        for (Integer element : myNumber) {
            System.out.print(element + " ");
        }

        // Sort an Linked List using Collections class:
        Collections.sort(myNumber);
        System.out.println("\nmyNumber After Sorting = " + myNumber);
    }
    
}