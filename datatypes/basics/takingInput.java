package datatypes.basics;
import java.util.Scanner;

public class takingInput {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);// scanner lete hai inputs lene ke liye

    System.out.print(("Enter Radius: "));
     double r = sc.nextDouble();
     double a = 3.141592*r*r;
     System.out.print("The Area of Circle : ");
     System.out.println(a);
  }
}
