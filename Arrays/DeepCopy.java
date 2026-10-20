package Arrays;
import java.util.Arrays;
public class DeepCopy {
  public static void main(String[] args) {
    int[] arr={23,42,11,23,1,4};
    int[] y=Arrays.copyOf(arr,arr.length);// deep copy
    y[0]=100;
    System.out.println(y[0]);
    System.out.println(arr[0]);
  }
}
