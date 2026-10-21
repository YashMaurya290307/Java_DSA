package Arrays;

public class linearSearch {
  public static void main(String[] args) {
    int[] arr={1,2,4,-8,6,423,35,1,41,44,4};
    int target=44;
    boolean flag=false;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]==target){
        flag=true;
      break;
    }
    }
  if(flag==true) System.out.println("Target exists");
  else System.out.println("Target missing");
  }
}