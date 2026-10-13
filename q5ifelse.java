import java.util.Scanner;

public class q5ifelse {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter selling price: ");
    int sp = sc.nextInt();
    System.out.println("Enter cost price: ");
    int cp = sc.nextInt();
    if (sp>cp) {
      System.out.println("Profit");
      
    }
    else if (sp==cp) {
      System.out.println("Nothing happened");
      
    }
    else{
      System.out.println("Loss");
    }
  }
  
}
