package Arrays;

public class productOfArray {
  public static void main(String[] args) {
    
  int[] arr={1,2,3,4,5,6};
  int product = 1 ;
  for(int i = 0;i<arr.length;i++){
    product *=arr[i];
  }
    System.out.print(product);
  }
}
