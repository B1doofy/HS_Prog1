import java.util.Scanner;

public class Prime {

  public static void main(String[] args) {
    System.out.println("Obergrenze?");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();  // ask user for upper bound
    
    boolean dividerFound = false;
    for (int i = 2; i <= n; i = i + 1) {
      for (int j = 2; j <= i / 2; j = j + 1) {
        if (i % j == 0) {
          dividerFound = true;
        }
       }
       if (!dividerFound) {
         System.out.println(i);
       }
       dividerFound = false;
    } 
  }
}
