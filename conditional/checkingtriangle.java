package conditional;
import java.util.Scanner;

public class checkingtriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first side:");
    int x=sc.nextInt();
    System.out.println("enter second side: ");
    int y=sc.nextInt();
    System.out.println("enter third side: ");
    int z= sc.nextInt();
    if (x+y>z || x+z>y || y+z>x) {
      System.out.println("Triangle");
    }else{
      System.out.println("Not a triangle");
    }
  }
}
