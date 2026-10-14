package conditional;
import java.util.Scanner;

public class ladder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a%3 ==0 && a%5 ==0) {
      System.out.println("Yash");
    }else if(a%3 == 0 || a%5 == 0){
      System.out.println("Harsh");
    }else if(a%5 == 0){
      System.out.println("Jeeshan");
    }else  {
      System.out.println("Kritharth");
      
    }
    
  }
}
