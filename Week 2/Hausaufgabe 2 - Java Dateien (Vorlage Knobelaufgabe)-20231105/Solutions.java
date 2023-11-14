public class Solutions {
  public static void main(String[] args) {
    String formula = "x*x*x-73*x*x+1655*x-11951=0";
    System.out.println("Löse die Formel: "+formula);

    for(int i=1; i <= 100; i++) {
      double resultFormula = Math.pow(i, 3)-73*Math.pow(i, 2)+i*1655-11951;
      //System.out.println(resultFormula);
      if(resultFormula ==0){
        System.out.println("x = "+i);
      }
    }
  }
}

