package Arrays;
import java.util.Arrays;

public class sort {
  public static void main(String[] args) {
    int[] arr={1,-9,0,65,87,5};
    print(arr);
    Arrays.sort(arr);
    print(arr);
  }
  public static void print(int[] arr) {
    for (int j = 0; j < arr.length; j++) {
      System.out.print(arr[j]+" ");
  }
    
   System.out.println();
  }
}
