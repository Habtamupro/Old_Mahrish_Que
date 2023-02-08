package largestPrimeFactor;

import java.util.ArrayList;
import java.util.Collections;

public class primeFact {
    static int largestPrimeFactor(int n) {
        if(n <= 1){
            return 0;
        }
        else {
            ArrayList<Integer> Factors = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    int count = 0, div = 1;
                    while (div <= i) {
                        if (i % div == 0) {
                            count++;
                        }
                        div++;
                    }
                    if (count == 2) {
                        Factors.add(i);
                    }
                }
            }
            Collections.sort(Factors);
            return Factors.get(Factors.size() - 1);
        }
    }

    public static void main(String[] args){
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }

}
