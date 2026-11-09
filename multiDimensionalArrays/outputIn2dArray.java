package multiDimensionalArrays;

public class outputIn2dArray {
  public static void main(String[] args) {
    //  int[][] arr = new int[3][4];
    int[][] arr={{3,4,2,4,2},{244,2,2,2,4},{24,2,4,32,2},{2,42,2,3,2}};
    for (int i = 0; i <arr.length; i++) {
      for (int j = 0; j <arr[0].length; j++) {
        System.out.print(arr[i][j]+" ");
      }System.out.println();
    }
  }
}
