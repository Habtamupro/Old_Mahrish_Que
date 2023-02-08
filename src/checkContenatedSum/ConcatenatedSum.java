package checkContenatedSum;

public class ConcatenatedSum {
    static int checkConcatenatedSum(int n, int Catlen){
        int val=0,sum=0,intial_N=n;
            while (n > 0) {
                int rem = n % 10;
                n /= 10;
                int multiplier = 1, count = 1;
                while (count < Catlen) {
                    multiplier *= 10;
                    count++;
                }
                int ConcatantionCount = 1;
                while (ConcatantionCount <= Catlen) {
                    sum += (rem * multiplier);
                    multiplier /= 10;
                    ConcatantionCount++;
                }
            }
        if(sum == intial_N){
            val =1;
        }

        return val;
    }

    public static void main(String[] args){
        System.out.println(checkConcatenatedSum(198,2));
        System.out.println(checkConcatenatedSum(198,3));
        System.out.println(checkConcatenatedSum(2997,3));
        System.out.println(checkConcatenatedSum(2997,2));
        System.out.println(checkConcatenatedSum(13332,4));
        System.out.println(checkConcatenatedSum(9,1));
    }
}
