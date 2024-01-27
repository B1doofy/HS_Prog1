public class ExponentialCalc {
    public static void main (String args[]){
        System.out.println(calcThatShit(3,2));
        

    }
    public static int calcThatShit(int base, int n){
        if(n == 0){
            return 1;
        }
        return(base * calcThatShit(base, n-1));
    }
    
}
