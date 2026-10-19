package Arrays;

public class max {
  public static void main(String[] args) {
    int[] arr= {9,23,84,9,3,23,900};
    int max=0;
    for (int i = 0; i < arr.length; i++) {
      max= Math.max(arr[i],max);
    }System.out.println(max);
  }
}
