package multiDimensionalArrays;

public class sum {
  public static void main(String[] args) {
    int[][] arr={{1,1,1,1,1},{2,2,2,2,2},{1,0,0,0,0},{1,1,1,1,1}};
    int sum=0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        sum +=arr[i][j];
      }
    }
    System.out.println(sum);
  }
}
