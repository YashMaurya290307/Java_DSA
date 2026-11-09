package multiDimensionalArrays;

public class rowWithMaxSum {
  public static void main(String[] args) {
    int[][] arr={{2,2,2,2,2},{3,3,3,3,3},{1,1,1,1,1},{2,2,23,3,4}};
    int maxSum=Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
        int sum =0;
        for (int j = 0; j < arr[0].length; j++) {
          sum +=arr[i][j];
        }
        maxSum = Math.max(maxSum, sum);
      }        
      System.out.println(maxSum);
  }
}
