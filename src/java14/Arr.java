package java14;

import java.util.ArrayList;

public class Arr {
	public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
// Displaying the ArrayList before removing elements
        System.out.println("ArrayList before removing element: " + arrayList);
        // Removing all the elements from the ArrayList
        arrayList.clear();
        // Displaying the ArrayList after removing elements
        System.out.println("ArrayList after removing element: " + arrayList);

    }
}
