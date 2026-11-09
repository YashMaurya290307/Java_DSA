package Strings;

import java.util.Scanner;

public class digitCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // double n=sc.nextDouble();
    // String s=" "+n;
    // System.out.println(s.length());
    int n = sc.nextInt();
    int count=0;
    while (n!=0) {
      n /= 10;
      count++;
    }
    System.out.println(count);
  }
}
