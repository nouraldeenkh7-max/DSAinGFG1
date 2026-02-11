package ArrayGFG.ArrayListGFG;

import java.util.ArrayList;

public class Operation {
    public static void main(String[] args) {
// Initialize a dynamic String ArrayList
        ArrayList<String> names=new ArrayList<>();
// Populate the list with elements using the add() method
        names.add("nour");
        names.add("ahmed");
        names.add("hala");
// Display the elements of the array list
        System.out.println(names);
// Remove a specific element by value using the remove() method
        names.remove("hala");
// Display the list after the removal process
        System.out.println(names);
// Update an element at a specific index using the set() method
        names.set(1,"tala");
// Display the final list to verify the update operation
        System.out.println(names);
    }
}
