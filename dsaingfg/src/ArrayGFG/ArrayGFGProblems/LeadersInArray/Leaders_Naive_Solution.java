package ArrayGFG.ArrayGFGProblems.LeadersInArray;

import java.util.ArrayList;

public class Leaders_Naive_Solution {

    /**
     * Problem: Leaders in an Array.
     * An element is a leader if it is greater than all the elements to its right side.
     * Time Complexity: O(n^2) - Naive Approach.
     */
    static ArrayList<Integer>getLeader(int[]arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int size = arr.length;
        for (int i = 0; i<size; i++) {
            // Assume the current element is a leader until proven otherwise
            boolean isLeader=true;
            for (int j=i+1; j<size; j++){

                // If any element to the right is greater, the current element is not a leader
                if (arr[j] > arr[i]) {
                    isLeader = false;
                    break;
                }
                  }
            // If isLeader is still true, it means no larger element was found to the right
                if (isLeader==true)
                    result.add(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        // Calling the function and storing the returned leaders in the ArrayList
        ArrayList<Integer>result=getLeader(arr);
        System.out.print("Leaders:");
        for(int res:result){
            System.out.print(res+" ");
        }
    }
}
