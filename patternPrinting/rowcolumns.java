package patternPrinting;
import java.util.Scanner;

public class rowcolumns {
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.print("Number of Rows: ");
    int row = sc.nextInt();
    System.out.print("Number of Columns: ");
    int col = sc.nextInt();
    for (int i = 1; i<=row; i++) {// kitni lines print hogi
      for (int j = 1; j<=col; j++) {//kitni stars ek line me print hogi
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
