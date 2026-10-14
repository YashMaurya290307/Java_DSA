package datatypes.basics;
import java.util.Scanner;

public class simpleInterest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.print("Enter P: ");
    // double x = sc.nextInt();
    // System.out.print("Enter R: ");
    // double y = sc.nextInt();
    // System.out.print("Enter T: ");
    // double z = sc.nextInt();
    // double si = (x*y*z) / 10;
    // System.out.print("Simple Interest: ");
    // System.out.println(si);
    int p=69,r=5,t=8;
    double si = p*r*t/100.0;
    System.out.println(si);
    }
}