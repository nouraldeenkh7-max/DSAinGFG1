package AlgorithmsTechniques.TwoPointer.P01_PairWithSum;

public class Approach1_NaiveMethod {
    public static boolean hasPairNaive(int[]arr,int target){
        int size=arr.length;
        for (int i=0; i<size; i++){
            for (int j=i+1; j<size; j++){
                int sum=arr[i]+arr[j];
                if(sum==target){
                    return  true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[]arr1={10,20,35,50};
        int target1=70;
        System.out.println("Test 1:"+hasPairNaive(arr1,target1));
        int[]arr2={10,20,30};
        int target2=70;
        System.out.println("Test 2:"+hasPairNaive(arr2,target2));
        int[]arr3={-8,1,2,6,10};
        int target3=16;
        System.out.println("Test 3:"+hasPairNaive(arr3,target3));
    }
}
