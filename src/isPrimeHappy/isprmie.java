package isPrimeHappy;

public class isprmie {
    static int isPrimeHappy(int n){
        int num=2,sum=0;
        if(n > 2) {
            while (num < n) {
                int isprime = 1, count = 0;
                while (isprime * isprime <= num) {
                    if (num % isprime == 0) {
                        count++;
                    }
                    isprime++;
                }
                if (count + 1 == 2) {
                    sum += num;
                }
                num++;
            }
            if (sum % n == 0) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String [] args){
        System.out.println(isPrimeHappy(5));
        System.out.println(isPrimeHappy(25));
        System.out.println(isPrimeHappy(32));
        System.out.println(isPrimeHappy(8));
        System.out.println(isPrimeHappy(2));
    }


}
