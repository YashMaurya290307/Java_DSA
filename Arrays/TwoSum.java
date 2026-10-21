package Arrays;

public class TwoSum {
  public static void main(String[] args) {
    public static boolean twoSum(int arr[], int target) {
        // code here
        System.out.println("Print sum: ");
        int n=arr.length;
        for(int i=0;i<n;i++){
             for(int j = i+1;j<n;j++){
                 if(arr[i]+arr[j]==target)
                  return true;
                 }
        }
        return false;
    
}
}
  

