package ArrayGFG;

public class ArrayErrors {
    public static void main(String[] args) {
// Declare and initialize an integer array with 5 elements
        int[] number={1,2,3,4,5};
        // Accessing an index outside the array bounds will throw an error
        // Expected Error: ArrayIndexOutOfBoundsException
        System.out.println(number[5]);
    }
}
