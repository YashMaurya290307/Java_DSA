package loops;

import java.util.Scanner;

public class sumofdigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n=sc.nextInt();
    System.out.print("Sum: ");
    int sum=0;
    while (n!=0) {
      sum = sum + (n%10);
      n/=10;
      
      
    }System.out.println((sum>0)?sum:-sum);
  }
}
