package largestAdjacentSum;

public class largest {
    public static int largestAdjacentSum(int[ ] a){
       int count=0,sum = 0,largest_Sum=0;
       if(a.length > 2) {
           while (count < a.length) {
               if (count < a.length - 1) {
                   sum = a[count] + a[count + 1];
               }
               if (sum > largest_Sum) {
                   largest_Sum = sum;
               }
               count++;
           }
       }
        return largest_Sum;
    }
    public static void main(String[] args){
        System.out.println(largestAdjacentSum(new int[]{1, 2, 3, 4} ));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10} ));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1} ));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1} ));
    }
}
