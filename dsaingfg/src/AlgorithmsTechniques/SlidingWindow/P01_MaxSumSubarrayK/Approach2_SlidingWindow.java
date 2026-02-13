package AlgorithmsTechniques.SlidingWindow.P01_MaxSumSubarrayK;

public class Approach2_SlidingWindow {
 public  static int findMaxSumSlidingWindow(int[]arr,int k){
     if (arr == null || k <= 0 || k > arr.length) {
         return 0;
     }
     int size=arr.length;
     int maxSum=Integer.MIN_VALUE;

     int windowSum=0;
     for (int i=0; i<k; i++){
         windowSum+=arr[i];
     }
     maxSum=windowSum;
     for (int j=k; j<size; j++){
         windowSum=windowSum+arr[j]-arr[j-k];
         maxSum=Math.max(maxSum,windowSum);
     }

     return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1={5,2,-1,0,3};
        int k1=3;
        System.out.println("Maximum Sum (Sliding Window): " + findMaxSumSlidingWindow(arr1, k1));
    }
  }

