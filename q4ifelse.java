import java.util.Scanner;

public class q4ifelse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();// n = 3.141592
    int x = (int)n; // x = 3
    if(n-x > 0){ 
      System.out.println("Not an integer");
    }
    else{ 
      System.out.println("Is an integer");
    }
  }
}
