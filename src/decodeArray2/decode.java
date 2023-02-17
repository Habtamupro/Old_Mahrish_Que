package decodeArray2;

public class decode {
    static void decodeArray(int [ ] a){
        int index,j,count=0, Num_sign = 1;
        boolean isNegative = false;
        for ( j =0; j< a.length; j++) {
            if (a[j] > 0) {
                System.out.print(0);
            } else if(a[j] < 0)  {
                Num_sign = -1;
            }
            else {
                index = j;
                while (index < a.length) {
                    if (a[index] == 0) {
                        count++;
                    }
                    if (a[index] != 0) {
                        j = index;
                        if(!isNegative) {
                            System.out.print(count * Num_sign);
                            isNegative = true;
                        }
                        else{
                            System.out.print(count);
                        }
                        break;
                    }
                    index++;
                }
                count =0;
            }
        }
        System.out.println();

    }
    public static void main(String[] args){
        decodeArray(new int[]{1});
        decodeArray(new int[]{0,1});
        decodeArray(new int[]{-1,0,1});
        decodeArray(new int[]{0,1,1,1,1,1,0,1});
        decodeArray(new int[]{-1, 0, 0, 1, 1, 0, 1});
        decodeArray(new int[]{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1});
    }
}
