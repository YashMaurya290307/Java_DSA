package Arrays;

public class missingElement {
  public static void main(String[] args) {
    int[] arr={1,2,3,5,6,7,8};
    int n=arr.length+1;
    int sum=n*(n+1)/2;
    int arraySum=0;
    for(int ele:arr){
      arraySum +=ele;
    }   System.out.print(arraySum);
  }
}
