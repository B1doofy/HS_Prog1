import java.util.Scanner;

public class Sum {
    
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Eingabe erste Zahl:");
        int number1 = in.nextInt();
        System.out.println("Eingabe zweite Zahl:");
        int number2 = in.nextInt();
        int sum = number1 + number2;
        System.out.println("Ergebnis ist "+ sum +" !" );

	}
}
//by Viet Hung Ly