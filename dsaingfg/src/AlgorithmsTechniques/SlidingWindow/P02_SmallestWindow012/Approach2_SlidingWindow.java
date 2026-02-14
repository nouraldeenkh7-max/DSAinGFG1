package AlgorithmsTechniques.SlidingWindow.P02_SmallestWindow012;

public class Approach2_SlidingWindow {
    public static  int findSmallestWindowSlidingWindow(String S){
        int zeroIndex=-1,oneIndex=-1,twoIndex=-1;
        int minLen=Integer.MAX_VALUE;
        int size=S.length();
        for (int i=0; i<size; i++) {
            char currentChar = S.charAt(i);
            if (currentChar == '0') {
                zeroIndex = i;
            } else if (currentChar == '1') {
                oneIndex = i;
            } else if (currentChar=='2'){
                twoIndex=i;
            }
            int start= Math.min(zeroIndex,Math.min(oneIndex,twoIndex));
            int end= Math.max(zeroIndex,Math.max(oneIndex,twoIndex));
            if (zeroIndex!=-1 && oneIndex!=-1 && twoIndex!=-1){
           minLen=Math.min(minLen,end-start+1);
            }
        }
        return (minLen==Integer.MAX_VALUE)?-1:minLen;
    }
    public static void main(String[] args) {
        String s1 = "01212";
        System.out.println("Input: " + s1 + " -> Output: " + findSmallestWindowSlidingWindow(s1));
    }
}
