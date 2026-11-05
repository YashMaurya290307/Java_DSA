package Strings;

import java.util.Scanner;

public class concat {
  public static void main(String[] args) {
    // String s="yash hi ";
    // s +="dsa ka king hai  ";
    // s +="log pyar se ";
    // s +=" canny bulate hai";
    // System.out.println(s);
    // System.out.println("yash"+10+10);
    // System.out.println(10+10+"yash");
    // System.out.println('A'+2+"yash");
    Scanner sc=new Scanner(System.in);
    double n=sc.nextDouble();
    String s=" ";
    s += n;
    System.out.println(s.length());
  }
}
