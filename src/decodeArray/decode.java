package decodeArray;

import java.util.ArrayList;

public class decode {
    static void decodeArray(int[ ] a){
      ArrayList<Integer> values = new ArrayList<>();
      int count = 0;
      boolean isnegative = false;
      while(count + 1 < a.length){
          int abs = (a[count] - a[count + 1]);
          if(abs < 0){
              abs*= (-1);
          }
          if(a[0] < 0 && !isnegative){
              abs*= (-1);
              isnegative = true;
          }
          values.add(abs);
          count++;
      }
      for(int i : values){
          System.out.print(i);
      }
        System.out.println();
    }
    public static void main(String [] args){
        decodeArray(new int[]{0, -3, 0, -4, 0});
        decodeArray(new int[]{-1, 5, 8, 17, 15});
        decodeArray(new int[]{-4, -5, 2, 15, 10});
        decodeArray(new int[]{1, 5, 8, 17, 15});
        decodeArray(new int[]{111, 115, 118, 127, 125});
        decodeArray(new int[]{1, 1});
    }
}
