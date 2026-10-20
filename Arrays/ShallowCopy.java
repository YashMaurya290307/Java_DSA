package Arrays;

public class ShallowCopy {
  public static void main(String[] args) {
    int[] arr={12,35,54,94,95};// 20 bytes-- memory allocation
    System.out.println(arr[2]);
    int[] x=arr; // x is shallow copy of arr
    x[2]=192;
    System.out.println(arr[2]);
  }
}
