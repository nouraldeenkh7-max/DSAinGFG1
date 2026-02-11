package AlgorithmsTechniques.TwoPointer.P01_PairWithSum;

public class Approach2_TwoPointers {
    public static  boolean hasPairTwoPointer(int[]arr,int target){
        int size=arr.length;
        int left=0,right=size-1;
        while (left<right){
            int sum=arr[left]+arr[right];
            if (sum==target){
                return true;
            }
            else if (target>sum){
                left++;
            }
            else
                right--;

        }
        return false;
    }
    public static void main(String[] args) {
        int[]arr1={10,20,35,50};
        int target1=70;
        System.out.println("Test 1:"+hasPairTwoPointer(arr1,target1));
        int[]arr2={10,20,30};
        int target2=70;
        System.out.println("Test 2:"+hasPairTwoPointer(arr2,target2));
        int[]arr3={-8,1,2,6,10};
        int target3=16;
        System.out.println("Test 3:"+hasPairTwoPointer(arr3,target3));
    }
}
