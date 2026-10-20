package Arrays;

public class passingArrayToMethod {
  public static void main(String[] args) {
    int[] x={10,2,29,38};
    System.out.println(x[2]);
    change(x);
    System.out.println(x[2]);
  }
  public static void change(int[]x) {
    x[2]=90;
  }
}
