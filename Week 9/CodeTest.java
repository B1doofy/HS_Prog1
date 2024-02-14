
// created by us for you
class CodeTest {
  public static void main(String[] args) {

    //System.out.println(integerDiv(1, 0)); // ist buggy. b != 0
    //System.out.println(integerDiv(1, 1)); // ist falsch. 1 div 1 ist 1. Zurückgegeben wird 0
    //System.out.println(integerDiv(8, 4)); // ist falsch 8 div 4 ist 2
    //System.out.println(integerDiv(8, -4));// negative zahlen werden nicht rausgefiltert

    //wo ist der return oder das sysout für reverse lol
  }

  static int integerDiv(int a, int b) {
    int result = 0;
    while (a - b > 0) {
      result++;
      a = a - b;
    }
    return result;
  }
  public static void reverse(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      int tmp = arr[i];
      arr[i] = arr[arr.length-i];
      arr[arr.length-i] = tmp;
    }
  }  
}
