package AlgorithmsTechniques.SlidingWindow.P01_MaxSumSubarrayK;

public class Approach1_NaiveMethod {
    public static int getMaxSum(int[] arr, int k) {
        if (arr == null || k <= 0 || k > arr.length) {
            return 0;
        }
        int size = arr.length;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i <= size-k; i++) {
            int currentSum = 0;
            for (int j = i; j < i + k; j++) {
                currentSum += arr[j];
            }
            if (currentSum > max_sum) {
                max_sum = currentSum;
            }

        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr1={5,2,-1,0,3};
        int k1=3;
        System.out.println("Maximum sum of subarray of size " + k1 + " is: " + getMaxSum(arr1, k1));

    }
  }