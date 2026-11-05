package Strings;

public class builtinfxn {
  public static void main(String[] args) {
    //String s="Yash Maurya";
    // System.out.println(s.lastIndexOf('a'));
    // System.out.println(s.toLowerCase());
    // System.out.println(s.toUpperCase());
    String s="Harshita";
    System.out.println(s.contains("Harsh"));
    if(s.contains("arsh"))
      System.out.println("YASH MAURYA ");
    String a="arsh";
    String b="bhandari";
    System.out.println(a.compareTo(b));// ye (a-b)=(-1) ko  print kr dega
    System.out.println(b.compareTo(a)); // ye (b-a)=(1) ko print kr dega
    String s1="Harshita";
    String s2="Harsh";
    System.out.println(s2.compareTo(s1));// harshita me 3 words extra hai harsh se 
  }
}
