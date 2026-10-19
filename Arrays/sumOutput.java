package Arrays;

public class sumOutput {
  public static void main(String[] args) {
   int[] arr = {-6,8,14,23,2,4,27,47,7};
   int min  = arr[0];
   for (int i = 0; i < arr.length; i++) {
    if(arr[i]<min) min=arr[i];
   }System.out.println(min);
  }
}
