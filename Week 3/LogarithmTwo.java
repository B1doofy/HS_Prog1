public class LogarithmTwo {
    public static void main(String[] args){
        double logOf2 = Math.log(2);
        double sum = 1;
        double differenceLog = 1;
        double i = 1; 
        int count = 1;
        //Math.abs gibt den Absolut-Wert aus. Sprich die Zahl ohne Vorzeichen, kein +, kein -
        while (Math.abs(differenceLog) >= 0.0023){  
            count++;
            i++;
            //System.out.println(i);
            //System.out.println(count);
            //System.out.println(1/i);
            if(i % 2 == 0 ){
                sum = sum - 1/i;
                //System.out.println(sum);
            }
            else {
                sum = sum + 1/i;
                //System.out.println(sum);
            }
            differenceLog = logOf2 - sum;
            //System.out.println(differenceLog);
        }
        System.out.println("Log von 2: "+Math.log(2));
        System.out.println("Summe von Summanden: "+sum);
        //System.out.println(Math.abs(differenceLog) >= 0.0023);
        System.out.println("Diffrenz von Log2 und Summe von Summanden: "+differenceLog);
        System.out.println("Anzahl der Summanden: "+count);
    }   
}
