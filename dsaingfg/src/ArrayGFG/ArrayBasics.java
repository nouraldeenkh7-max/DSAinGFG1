package ArrayGFG;

public class ArrayBasics {
    public static void main(String[] args) {
// Declaring and initializing an int array with 5 values
        int[] myArray={1,2,3,4,5};

// Store the array length in a variable
        int size=myArray.length;
        System.out.println("size:"+size);

// Iterate through the array to print all elements
        for (int i=0; i<size; i++){
            System.out.print(myArray[i]+" ");}

        System.out.println();

// Update the input values in the array
        myArray[0]=99;
        myArray[4]=8;
// Print the array elements after modification
        for (int x=0; x<size; x++){
            System.out.print(myArray[x]+" ");}

}}
