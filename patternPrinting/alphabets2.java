package patternPrinting;

import java.util.Scanner;

public class alphabets2 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <=n; i++) {
      for (int j = 1; j <=n; j++) {
        if (i%2 == 1) System.out.print((char)(j+96)+ " ");
          else System.out.print((char)(j+64)+" ");
        
      }System.out.println();
      
    }
  }
}
