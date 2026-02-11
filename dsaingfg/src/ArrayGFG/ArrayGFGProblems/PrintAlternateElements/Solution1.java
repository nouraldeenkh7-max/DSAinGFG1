package ArrayGFG.ArrayGFGProblems.PrintAlternateElements;
/* PROBLEM: Print every alternate element of an array starting from the first element.
* APPROACH: Iterative Method (Using a For-Loop).
* DESCRIPTION: This is the most efficient way to solve the problem in terms of memory.
* The loop starts at index 0 and increments by 2 in each iteration (i += 2),
* effectively skipping every second element until the end of the array is reached.
* This approach has a Time Complexity of O(n) and Space Complexity of O(1).*/
public class Solution1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int size = arr.length;
        for (int i = 0; i < size; i += 2) {
            System.out.println(arr[i]);
        }
    }
}
