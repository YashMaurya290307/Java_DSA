package Arrays;

import java.util.Scanner;

public class negativevalues {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size ");
      int n = sc.nextInt();
      int[] yash = new int[n];
      System.out.print("Enter arrays elements: ");
      for (int i = 1; i < n ; i++) {
        yash[i]=sc.nextInt();
      }
      for (int i = 0; i <n; i++) {
         if(yash[i]<0)
         System.out.print(yash[i]+" ");      }
     }
  }

