 package loops;

import java.util.Scanner;

class primeornot {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean flag = true;
   for(int i=2;i<=Math.sqrt(n);i++){
    if (n%i==0) {
      flag = false; //1 means composite
      break;
    }
   }
   if (n==1) System.out.println("NEITHER PRIME NOR COMPOSITE");
   else if(flag==false) System.out.println("Composite number");
    else System.out.println("Prime Number");
   }
  }
