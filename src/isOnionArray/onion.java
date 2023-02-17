package isOnionArray;

public class onion {
    static int isOnionArray(int[ ] a){
        int k=a.length-1,j=0;
        if(a.length < 2){
            return 1;
        }
            while (j < k) {
                if ((a[k] + a[j]) > 10 && (j + k ) == a.length -1 ) {
                    return  0;
                }
                j++;
                k--;
            }
            return 1;
    }
    public static void main(String [] args){
        System.out.println(isOnionArray(new int[] {1, 2, 19, 4, 5}));
        System.out.println(isOnionArray(new int[] {1, 2, 3, 4, 15}));
        System.out.println(isOnionArray(new int[] {1, 3, 9, 8}));
        System.out.println(isOnionArray(new int[] {2}));
        System.out.println(isOnionArray(new int[] {}));
        System.out.println(isOnionArray(new int[] {-2, 5, 0, 5, 12} ));

    }

}
