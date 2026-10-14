package conditional;
import java.util.Scanner;

public class q6nestedifelse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Positive Integer: ");
    int x = sc.nextInt();
    if (x%5==0 && x%3!=0) {
      System.out.println("Divisible by 5");
       }
       else if (x%3==0) {
        System.out.println("Divisible by 3");
       }else if (x%5==0 && x%3==0) {
        System.out.println("Divisible by 5 and 3 both");
       }else{
        System.out.println(" not Divisible by both");
       }
  }
}
