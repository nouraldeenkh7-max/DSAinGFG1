package ArrayGFG.ArrayGFGProblems.LeadersInArray;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders_Optimized_Solution {

    /**
     * Problem: Leaders in an Array.
     * An element is a leader if it is greater than or equal to all the elements to its right side.
     * Time Complexity: O(n) - Optimized Approach using a single pass from right to left.
     */
    static ArrayList<Integer>getLeadersOptimized(int[]arr){
        ArrayList<Integer>leadersList=new ArrayList<>();
        int size=arr.length;

        // Initialize currentMax with the last element, as it is always a leader
        int currentMax=arr[size-1];
        leadersList.add(currentMax);
        for (int i=size-2; i>=0; i--){
         // Check if the current element is greater than or equal to the maximum element found so far on the right
         if (arr[i]>=currentMax){
             leadersList.add(arr[i]);
             // Update currentMax with the new leader value
             currentMax=arr[i];
          }
        }
        // Reverse the list to maintain the original relative order of elements
        Collections.reverse(leadersList);
        return leadersList;
    }
    public static void main(String[] args) {
        int[]arr={16,17,4,3,5,2};
        // Call the optimized function and store the result in an ArrayList
        ArrayList<Integer>leadersList=getLeadersOptimized(arr);
        System.out.print("Leaders:"+leadersList);

}}
