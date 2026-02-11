package ArrayGFG.ArrayGFGProblems.PrintAlternateElements;
import java.util.ArrayList;
/**
 * PROBLEM: Collect every alternate element of an array into a list.
 * APPROACH: Recursive Method (Data Collection).
 * DESCRIPTION: Instead of just printing, this version stores the selected elements
 * into an ArrayList. This is useful when the data is needed for further processing.
 */
public class solution3 {
static void collectItems(int[] arr,int index,ArrayList<Integer> list){
// Base Case: Prevent infinite recursion and OutOfBounds error
       if(index>=arr.length){return;}
// Logic: Add the current element to the shared list
       list.add(arr[index]);
// Recursive Call: Pass the same list to the next alternate index
       collectItems(arr,index+2,list);}
public static void main(String[] args) {
      int[] myArray={10,20,30,40,50};
// Create a list to hold the collected results
           ArrayList<Integer> resultList=new ArrayList<>();
           collectItems(myArray,0,resultList);
           System.out.println(resultList);
// Final Output: Print the entire collected list */
    }
}
