package patternPrinting;

import java.util.Scanner;

public class horizontalflippedtriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <=n; i++) {
      for (int j = 1; j<=n+1-i ; j++) {   //we can also    //int j=n;j>=i;j--
        System.out.print("*  ");
        
      }System.out.println();
      
    }
  }
}
