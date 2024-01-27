public class SumEven {
    public static int sumEven(int n) {
      if (n <= 0) {
        return 0;
      } else if (n % 2 == 1) {
        return sumEven(n - 1);
      }
      return n + sumEven(n - 1);
    }
    
    public static void main(String[] args) {
      System.out.println(sumEven(7));
    }
  }