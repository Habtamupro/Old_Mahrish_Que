package encodeNumber;

import java.util.ArrayList;

public class encode {
    static ArrayList<Integer> encodeNumber(int n){
        ArrayList<Integer> dividers = new ArrayList<>();
        if (n > 1) {
            while (n % 2 == 0) {
                dividers.add(2);
                n /= 2;
            }
            for (int i = 3; i < n / 2; i++) {
                if (n % i == 0) {
                    dividers.add(i);
                    n /= i;
                }
            }
            if(n != 1) {
                dividers.add(n);
            }
        }
        return dividers;
    }
    public static void main(String[] args){
        System.out.println(encodeNumber(2));
        System.out.println(encodeNumber(6));
        System.out.println(encodeNumber(14));
        System.out.println(encodeNumber(24));
        System.out.println(encodeNumber(1200));
        System.out.println(encodeNumber(1));
        System.out.println(encodeNumber(-18));
    }

}
