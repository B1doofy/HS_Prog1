public class Homework10 {

    public static String hanoi3(int n, int start, int aim, int helper) {   
        String steps = ""; 
        
        if (n == 1) { 
            steps += start + " to " + helper + "\n"; 
            steps += helper + " to " + aim + "\n";   
            return steps; 
        }
        
        steps += hanoi3(n - 1, start, helper, aim);    
        steps += start + " to " + helper + "\n";       
        steps += helper + " to " + aim + "\n";         
        steps += hanoi3(n - 1, aim, start, helper);    
        
        return steps;
    }
    
    public static void main(String[] args) {
        System.out.println("Haonoi3 needs these steps for 5 pieces:\n" + hanoi3(5, 1, 3, 2));
    }

}
