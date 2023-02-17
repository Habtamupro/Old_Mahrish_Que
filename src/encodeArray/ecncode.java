package encodeArray;

import java.util.ArrayList;

public class ecncode {
    static ArrayList<Integer> encodeArray(int n){
        ArrayList<Integer> encoded = new ArrayList<>();
        if( n < 0){
            encoded.add(-1);
            n*=-1;
            while(n > 0) {
                int count=0;
                int rem = n%10;
                n/=10;
                if(rem == 0) {
                    encoded.add(1);
                }
                else {
                    while (count < rem) {
                        encoded.add(0);
                        count++;
                    }
                    encoded.add(1);
                }
            }

        }
        else if(n == 0){
            encoded.add(1);
        }
        else {
            while(n > 0) {
                int count=0;
                int rem = n%10;
                n/=10;
                if(rem == 0) {
                    encoded.add(1);
                }
                else {
                    while (count < rem) {
                        encoded.add(0);
                        count++;
                    }
                    encoded.add(1);
                }
            }
        }
     return encoded;
    }
    public static void main(String [] args){
        System.out.println(encodeArray(0));
        System.out.println(encodeArray(1));
        System.out.println(encodeArray(-1));
        System.out.println(encodeArray(100001));
        System.out.println(encodeArray(999));
    }

}
