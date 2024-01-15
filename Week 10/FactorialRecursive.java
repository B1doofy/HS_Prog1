// created by J. Konert

public class FactorialRecursive {
  
public static int factorial(int n) {
  if (n == 1) {
    return 1;
  }
  return n * factorial(n-1);
}

public static int factorialLoop(int n) {
  int result = 1;
  for (int i = 1; i <= n; i++) {
    result *= i;
  }
  return result;
}
  
  public static void main(String[] args) {
    System.out.println(factorial(4));
    System.out.println(factorialLoop(4));
  }
}
