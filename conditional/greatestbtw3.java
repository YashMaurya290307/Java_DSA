package conditional;
import java.util.Scanner;

public class greatestbtw3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first integer: ");
    int x = sc.nextInt();
    System.out.println("Enter second integer: ");
    int y = sc.nextInt();
    System.out.println("Enter third integer: ");
    int z = sc.nextInt();
    System.out.println("GREATEST INTEGER: ");
    if (x>=y && x>=z) {
      System.out.println(x);
       }else if (y>=x && y>=z) {
        System.out.println(y);
         }else{
          System.out.println(z);
         }
       
  }
}
/*SECOND METhod
 if(a>b && a>c){
 System.out.println(a);
  }
 else{
  if (b>a && b>C)
  System.out.println(b);
 else sout(c); 
  }


*/