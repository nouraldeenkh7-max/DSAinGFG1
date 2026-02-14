package AlgorithmsTechniques.SlidingWindow.P02_SmallestWindow012;

    public class Approach1_IndexTracking {
        public static int smallestWindowIndexTracking(String S) {
            int zeroIndex=-1,oneIndex=-1,twoIndex=-1;
            int minLen=Integer.MAX_VALUE;
            int size=S.length();
            for (int i=0; i<size; i++){
                char currentChar=S.charAt(i);
                if (currentChar=='0'){
                    zeroIndex=i;
                }
                else if (currentChar=='1') {
                    oneIndex=i;
                }
                else if (currentChar=='2'){
                    twoIndex=i;
                }
                if (zeroIndex != -1 && oneIndex != -1 && twoIndex != -1) {
                    int maxPos = zeroIndex;
                    if (oneIndex > maxPos) maxPos = oneIndex;
                    if (twoIndex > maxPos) maxPos = twoIndex;

                    int minPos = zeroIndex;
                    if (oneIndex < minPos) minPos = oneIndex;
                    if (twoIndex < minPos) minPos = twoIndex;

                    int currentLen = maxPos - minPos + 1;
                    if (currentLen < minLen) {
                        minLen = currentLen;
                    }
                }
            }
            return (minLen == Integer.MAX_VALUE) ? -1 : minLen;

        }
        public static void main(String[] args) {
            String S1="01212";
            System.out.println("Input String: " + S1);
            System.out.println("Smallest Window Length: " + smallestWindowIndexTracking(S1));

                }
            }

