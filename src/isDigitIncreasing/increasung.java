package isDigitIncreasing;

public class increasung {
     static int isDigitIncreasing(int n) {
         for(int i = 1; i <= 9; i++){
             int sum = 0;
             int num =i;
             for(int j =0; j<=9; j++){
                 sum+=num;
                 if(sum == num){
                     return 1;
                 }
                 if(sum < num){
                     break;
                 }
                 num = (num * 10) + i;
             }

         }
         return 0;
     }

     public static void main(String[] args){
         System.out.println(isDigitIncreasing(7));
         System.out.println(isDigitIncreasing(36));
         System.out.println(isDigitIncreasing(984));
         System.out.println(isDigitIncreasing(7404));
         System.out.println(isDigitIncreasing(7407));
     }

}
