public class DoubleSum {
    public static int doubleSum(int n) {
    System.out.println("test");
      if (n <= 0) {
        return 0;
      }    
      return n + doubleSum(n - 1) + doubleSum(n - 1);
    }
    
    public static void main(String[] args) {
      System.out.println(doubleSum(3));
    }
  }