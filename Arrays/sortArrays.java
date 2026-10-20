package Arrays;

import java.util.Arrays;

public class sortArrays {
  public static void main(String[] args) {
    int[] arr={33,5,24,-5,-9,875};
    print (arr);
    Arrays.sort(arr);
    print(arr);
  }
  public static void print(int[]arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }System.out.println();
  }
}
