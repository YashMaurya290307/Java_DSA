package loops;

import java.util.Scanner;

public class breakstatement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    for(int i =2; i<=1;i+=1){
      if (n%i==0) {System.out.println(" not a Prime");
        
      }else{
        System.out.println(" a prime");
      }
    }
  }
}
