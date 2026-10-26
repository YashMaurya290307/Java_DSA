package Basic_Sorting;

public class bubble_sortM2 {
  public static void print(int[] arr){
    for(int ele:arr){
      System.out.print(ele+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int[] arr={1,29,39,34,1,-9,0};
    int n=arr.length;
     print(arr);
    
  //   for (int  j= 1; j < n-1; j++) {
  //     for (int i = 0; i <n-1; i++) {
  //       if(arr[i]>arr[i+1]){
  //       int temp=arr[i];
  //       arr[i]=arr[i+1];
  //       arr[i+1]=temp;
  //     }
  //   }
  // }
  // Bubble sort Optimised
  for (int i = 0; i <n-1; i++) { //n-1 passes
    int swaps=0;
    for (int j = 0; j < n-1; j++) {
      if (arr[j]>arr[j+1]) {
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
        swaps++;
      }
    }
    if (swaps==0) break;
  }
    print(arr);
  }
}
