package ArrayGFG.Array;

public class ArrayMethods {
    public static void main(String[] args) {
// Initialize a float array with 4 decimal values
        float[] numbers = {2.3f, 4.2f, 6.9f, 8.4f};

// Pass the array to the method to calculate the sum
        Sum(numbers);

// Call the method and store the returned array
        int[] myArray=print();
        for (int x=0; x<myArray.length; x++){
            System.out.print(myArray[x]+" ");
        }
    }

    /* Method to calculate and print the sum of elements in a float array
     * @param numbers The array of float values*/
    public static void Sum(float[] numbers) {
        float sum = 0;

// Iterate through the array to accumulate the total sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("sum= " + sum);
    }

    // Method that creates and returns an integer array
    public static int[] print() {
        return new int[]{ 1,2,3,4 };
    }}