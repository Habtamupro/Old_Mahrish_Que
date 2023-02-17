package isZeroPlentiful;

public class zero {
    static int isZeroPlentiful(int[ ] a){
     int isplentful=0,i,j;
     for (i=0; i<a.length; i++){
         int  count =0;
         if(a[i] == 0){
             for(j=i; j < a.length; j++){
                 if(a[j] == 0){
                     count++;
                 } else if (a[j] != 0) {
                     i=j;
                     break;
                 }
                 if(j == a.length-1){
                     i=j;
                 }
             }
             if(count >= 4){
                 isplentful++;
             } else if (count > 0 && count < 4) {
                 isplentful= 0;
                 break;
             }
         }
     }
     return isplentful;
    }

    public static void main(String[] args) {
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 3, 4}));
        System.out.println(isZeroPlentiful(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{0}));
    }
}
