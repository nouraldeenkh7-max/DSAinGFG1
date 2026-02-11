package ArrayGFG.ArrayGFGProblems.PrintAlternateElements;

public class solution2 {
/* PROBLEM: Print every alternate element of an array starting from the first element.
* APPROACH: Recursive Method (Direct Printing).
* DESCRIPTION: The function prints the current element and calls itself with (index + 2).
* It processd the elements one by one without storing them in a collection.
*/
static void  printAlternates(int[] arr,int index){
// Base Case: Stop if the index goes out of array bounds
     if (index>=arr.length){return;}
// Logic: Print the element at the current index
    System.out.print(arr[index]+ " ");
// Recursive Call: Move to the next alternate element (skip one)
     printAlternates(arr,index+2);}

    public static void main(String[] args){
    int[] myArray={10,20,30,40,50};
// Initial call starting from the first element (index 0)
    printAlternates(myArray,0);}}
