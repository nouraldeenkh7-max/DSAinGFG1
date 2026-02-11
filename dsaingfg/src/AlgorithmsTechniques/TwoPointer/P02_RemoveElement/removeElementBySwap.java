package AlgorithmsTechniques.TwoPointer.P02_RemoveElement;

import java.util.ArrayList;

import static java.util.Collections.swap;

public class removeElementBySwap {
    public  static int removeElementBySwap(ArrayList<Integer>arr,int ele){
        int k=0;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) !=ele){
                swap(arr,i,k);
                k++;
            }
        }
        return k;
    }
    public  static void swap(ArrayList<Integer>arr,int i,int k){
        int temp=arr.get(i);
        arr.set(i,arr.get(k));
        arr.set(k,temp);
    }
    public static void main(String[] args) {
ArrayList<Integer>arr1=new ArrayList<>();
        arr1.add(3);
        arr1.add(2);
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        int ele1=3;
        System.out.println( removeElementBySwap(arr1,ele1));
        System.out.println(arr1);
    }
}
