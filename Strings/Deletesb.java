package Strings;

public class Deletesb {
  public static void main(String[] args) {
    String s="Devesh";
    StringBuilder sb= new StringBuilder(s);
    sb.deleteCharAt(1);
    sb.insert(1,'e');
    System.out.println(sb);
  }
}
