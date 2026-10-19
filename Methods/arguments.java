package Methods;

public class arguments {
//   public static void max(int a , int b , int c){
    
//     if (a>=b && a>=c) System.out.println(a);
//      else if (b>=a && b>=c) System.out.println(b); 
//     else System.out.println(c);
//   }
//   public static void main(String[] args) {
//        max(8,8,8);
//   }

// }
// public static void sum 
public static int max(int a,int b,int c){
  if(a>=b && a>=c) return a;
  else if(b>=a && b>=c) return b;
  else return c;
  }
  public static void main (String[] args){
  System.out.println(max(4,3,1));
  } 
}