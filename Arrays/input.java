package Arrays;

import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    // int[] karan= new int[7];
    // for (int i = 1; i <=6; i++) {
    //   System.out.print(karan[i]+" ");
      Scanner sc = new Scanner(System.in);
      int[] karan = new int[7]; 
      // input
      for (int i = 0; i<7; i++) {
        karan[i] = sc.nextInt();
      }
        //print
      for (int i= 0; i<7; i++) {
        System.out.print(2*karan[i]+" ");
      }
      
    }
  }

