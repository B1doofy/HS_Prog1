public class PiApproximated {
    public static void main(String[] args) {
        double result = 0.0;
        double sign = 1;

        for(double k = 0; k <= 1000000; k++){
            result = result + sign*(1 / (2*k +1));
            result = (-1) * result;
            sign = sign * (-1);
        } 
        System.out.println(4 * result);
    }
    
}
