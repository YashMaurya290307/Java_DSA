import java.util.Scanner;
public class q1ifelse2ifelse{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Positive number: ");
    int n=sc.nextInt();
    if(n%5==0){
      System.out.println("Number is divisible.");
    }else{
      System.out.println("Number is not divisible.");
    }
  }
}
