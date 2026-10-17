package patternPrinting;
import java.util.Scanner;

public class rectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    for (int i = 1; i<=row; i++) {
      System.out.println("* * * * * * * ");
    }
  }
}
