package Basic_Sorting;

public class selection_sorting {
  public static void print(int[] arr){
    for(int ele:arr){
    System.out.print(ele+" ");
  }
  System.out.println();
}
  public static void main(String[] args) {
    int[] arr={1,3,4,-2,3,-1,0,6};
    int n=arr.length;
    print(arr);
    for (int i = 0; i <n-1; i++) { // n-1 passes
      int min = Integer.MAX_VALUE;
      int mindx= -1;
      for (int j = i; j < n; j++) {
    if(arr[j]<min){
      min=arr[j];
      mindx=j;
    }      
      }
      //swap
      int temp=arr[i];
      arr[i]=arr[mindx];
      arr[mindx]=temp;
    }
    print(arr);
  }
}
