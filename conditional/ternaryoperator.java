package conditional;
import java.util.Scanner;

public class ternaryoperator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number: ");
    int x = sc.nextInt();
    //condition ? sach: jhoot
    System.out.println(x + "  "+ ((x%2==0) ? "even" : "odd"));
  }
}
