package Arrays;

  import java.util.ArrayList;
import java.util.Collections;

public class ArrayListJavaBasics {
  public static void main(String[] args) {
     ArrayList<Integer> arr = new ArrayList<>();
     arr.add(25);
     arr.add(21);
     arr.add(18);
    arr.add(10);
    arr.add(5);

    System.out.println(arr.get(2)); // arr[2]
    arr.set(3,50);
    System.out.println(arr.get(3));
    System.out.println(arr);//// isse array traversing arrays nhi hoga by ourselves .individual element ke sath kuch nhi kr skta
   int n=arr.size();
    for (int i = 0; i < arr.size(); i++) { //for loop se kuch bhi kr skte ho
      System.out.print(arr.get(i)+" ");
    }
    // for (int ele : arr) {
    //  System.out.print(ele+" ");  
    // }
    System.out.println();
    // 25 21 18 50 10 
    arr.add(78);
    arr.add(1,100);
    System.out.println(arr);
    // remove krna kisi element ko
    arr.remove(arr.size()-1);// ye last element ke liye perfect hai
    System.out.println(arr);
    // swapping of elements
    int i=0,j=arr.size()-1;
    while (i<j) {
      int temp=arr.get(i);
      arr.set(i,arr.get(j));
      arr.set(j,temp);
      i++;
      j--;
       }
       System.out.print(arr);
      // arrays ko reverse krna
      Collections.reverse(arr);
      System.out.println(arr);
  }
}
 