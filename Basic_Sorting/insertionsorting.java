package Basic_Sorting;

public class insertionsorting {
  public static void main(String[] args) {
    int[] arr={1,6,4,7,9,-5,94};
    for (int i = 1; i < arr.length; i++) {
        int j=i;
        while (j>0 && arr[j]<arr[j-1]) {
          int temp=arr[j];
          arr[j]=arr[j-1];
          arr[j-1]=temp;
          j--;        
        }      
    }
    for(int ele:arr) System.out.print(ele+" ");
  }
}
