package AlgorithmsTechniques.TwoPointer.P02_RemoveElement;

import java.util.ArrayList;

public class Approach1_AdditionalSpace {
public  static ArrayList<Integer>removeElementBasic(int arr[],int ele){
    ArrayList<Integer> lest=new ArrayList<>();
    int size=arr.length;
    int i=0;
    while (i<size){
        if(arr[i] != ele){
            lest.add(arr[i]);
        }
        i++;
    }
    return lest;
}
    public static void main(String[] args) {
int[]arr1={3,2,1,2,3};
int ele1=3;
        System.out.println(removeElementBasic(arr1,ele1));
    }
}
