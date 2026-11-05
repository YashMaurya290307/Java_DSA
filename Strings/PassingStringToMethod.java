package Strings;

public class PassingStringToMethod {
  public static void change(String x){
    x="Utakarsh";
  }
  public static void main(String[] args) {
    String x="raghav";
    System.out.println(x);
    x="yaSH MAURYA"; // change(x);
    System.out.println(x);
  }
}
