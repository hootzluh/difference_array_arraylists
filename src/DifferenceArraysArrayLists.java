import java.util.ArrayList;

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {
        // ----------- Example 1: Java Array (Fixed Size) -----------
        int[] numArray = new int[3]; // Array of length 3
        numArray[0] = 10;
        numArray[1] = 20;
        numArray[2] = 30;
        // numArray[3] = 40; // Uncommenting this line causes ArrayIndexOutOfBoundsException

        System.out.println("Array contents:");
        for (int i = 0; i < numArray.length; i++) {
            System.out.println("numArray[" + i + "] = " + numArray[i]);
        }

        // Arrays cannot change size: if we need a bigger array, we must make a new one
        int[] biggerArray = new int[5];
        for (int i = 0; i < numArray.length; i++) {
            biggerArray[i] = numArray[i]; // Manual copy required
        }
        // biggerArray[3] and biggerArray[4] are default to 0

        // ----------- Example 2: Java ArrayList (Dynamic Size) -----------
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(20);
        numList.add(30);
        numList.add(40); // ArrayList grows automatically

        System.out.println("\nArrayList contents:");
        for (int i = 0; i < numList.size(); i++) {
            System.out.println("numList.get(" + i + ") = " + numList.get(i));
        }

        // Removing and adding elements is easy
        numList.remove(1); // Removes value at index 1 (value 20)
        numList.add(50);   // Adds 50 to the end

        System.out.println("\nArrayList after modifications:");
        for (Integer num : numList) {
            System.out.println(num);
        }

        // ArrayLists can only hold objects, not primitives (must use Integer instead of int)
    }
}
