public class TowersOfHanoi {

    public static void hanoi(int n, int start, int aim) {
        if (n == 1) { 
            System.out.println(start + " to " + aim); 
            return; 
        }
        hanoi(n - 1, start, 6 - start - aim);
        System.out.println(start + " to " + aim);
        hanoi(n - 1, 6 - start - aim, aim);
    }

    public static void main(String[] args) {
        hanoi(4,1,3);
    }
}
