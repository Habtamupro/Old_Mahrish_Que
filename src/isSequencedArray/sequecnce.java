package isSequencedArray;

public class sequecnce {
    static int isSequencedArray(int[ ] a, int m, int n){
        int isSequenced = 0;
        if(a[0] == m && a[a.length-1] == n) {
            int count = 0;
            while ((count + 1) < a.length) {
                if (  (a[count + 1] == a[count] + 1) || (a[count] == a[count+1])) {
                        isSequenced = 1;
                }
                else {
                    isSequenced = 0;
                }
                count++;
            }
        }
     return isSequenced;
    }
    public static void main(String[] args){
        System.out.println(isSequencedArray(new int[]{1,2,3,4,5},1,5));
        System.out.println(isSequencedArray(new int[]{1, 3, 4, 2, 5},1,5));
        System.out.println(isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2},-5,-2));
        System.out.println(isSequencedArray(new int[]{0, 1, 2, 3, 4, 5},1,5));
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4},1,5));
        System.out.println(isSequencedArray(new int[]{1,2,5},1,5));
        System.out.println(isSequencedArray(new int[]{5, 4, 3, 2, 1},1,5));
        }
}
