package datatypes.basics;
import java.util.Scanner;

public class inputSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter x: ");
    int x = sc.nextInt();
    System.out.print("Enter y: ");
    int y = sc.nextInt();
    System.out.print("The sum is: ");
  System.out.print(x+y);
  }
}