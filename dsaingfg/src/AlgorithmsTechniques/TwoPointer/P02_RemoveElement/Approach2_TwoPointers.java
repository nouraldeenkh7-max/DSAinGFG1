package AlgorithmsTechniques.TwoPointer.P02_RemoveElement;

public class Approach2_TwoPointers {
    public  static int removeElementOptimized(int[]arr,int ele){
        int size=arr.length;
        int j=0;
        for (int i=0; i<size; i++){
            if(arr[i] != ele){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
    int[]arr1={3,2,1,2,3};
    int ele1=3;
    int k=removeElementOptimized(arr1,ele1);
        System.out.print("Remaining elements count: "+k);
        System.out.println(" ");
        for (int i=0; i<k; i++)
            System.out.print(arr1[i]+" ");
    }
}
