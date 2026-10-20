package Arrays;

public class min {
  public static void main(String[] args) {
    
    int[] arr = {3,4,5,676,33,464,6,45,-3};
    // int min = Integer.MAX_VALUE;
    int min = 0;
    for (int i = 0; i < arr.length; i++) {
if(arr[i]<min) min=arr[i];
    }
    System.out.println(min);
  }
}
