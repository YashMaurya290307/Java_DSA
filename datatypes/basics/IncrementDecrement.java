package datatypes.basics;
public class IncrementDecrement {
  public static void main(String[] args) {
    int yash = 10;
    System.out.println(yash);
    yash = yash + 6;
    System.out.println(yash);
    yash = yash - 7;
    System.out.println(yash);
    yash*=4;
    System.out.println(yash);
    int x = 20;
    x++;// x = x + 1  increment
    System.out.println(x);
    --x;//decrement
    System.out.println(x);
    // rules
    int z = 10;
    System.out.println(z++);//post increment pahle value print karge then assign karega(increase hoga)
    System.out.println(z);// increased value print hoga

  }
}
