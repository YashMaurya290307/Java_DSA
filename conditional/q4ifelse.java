package conditional;
import java.util.Scanner;

public class q4ifelse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number: ");
   double n = sc.nextDouble();
   if (n - (int)n == 0) 
  //  int n = (int)x;// ya to if(n - (int)n ==0)
  //  if (x-n >0) 
    System.out.println(" integer");
    
   else
    System.out.println(" not Integer");
   
  }
}