package conditional;
import java.util.Scanner;

public class fourdigitnumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int x = sc.nextInt();
    if (x>999 && x<=9999) {
      System.out.println("Four digit number.");
      
    }else{
      System.out.println("Not a four digit number");
    }
  }
}
