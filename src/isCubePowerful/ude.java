package isCubePowerful;

public class ude {
   static int isCubePowerful(int n) {
       int sum = 0,orginalN=n;
       if (n <= 0) {
           return 0;
       }
       else {
           while (n > 0) {
               int rem = n % 10;
               n/=10;
               int cubebVal=1;
               for (int i = 0; i < 3; i++) {
                   cubebVal *= rem;
               }
               sum += cubebVal;
           }
           if (sum == orginalN) {
               return 1;
           } else {
               return 0;
           }
       }
   }
    public static void main(String [] args){
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(87));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));
    }

}
