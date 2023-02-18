package isSystematicallyIncreasing;

public class symmetrical {
   static int isSystematicallyIncreasing(int[ ] a){
       int index =0,NumSize=1;
       while(index < a.length){
           int DividedArrayIndex=1,indexTracker=index;
           //Breaking down the array ex {1,1,2,1,2,3,1,2,3,4} to {1} {1,2} {1,2,3} {1,2,3,4} for checking which
           //is limiting the array index range
           while (DividedArrayIndex <= NumSize) {
               if (a[indexTracker] != DividedArrayIndex ) {
                   return 0;
               }
               indexTracker++;
               DividedArrayIndex++;
           }
           //giving the last index update to the index of the Array
           index = indexTracker;
           //Increasing the number size to check
           NumSize += 1;
       }
       return 1;
   }
   public static void main(String [] args){
       System.out.println(isSystematicallyIncreasing(new int[]{1} ));
       System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3} ));
       System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 3} ));
       System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 1, 2} ));
       System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 3, 1, 2, 1} ));
       System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 3} ));
       System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}));
       System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}));


   }

}
