import java.util.Scanner;

public class maexchen {

     public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Zuerst die kleinere Zahl eingeben dann die größere Zahl. Zahlen wzischen 1-6");
        System.out.println("Eingabe erste Zahl:");
        int number1 = in.nextInt();
        System.out.println("Eingabe zweite Zahl:");
        int number2 = in.nextInt();
        if((number1 >= 1 && number1 <= 6) && ((number2 >= 1 && number2 <= 6))){
            if(number1 > number2) {
                System.out.println("Falsche Reihenfolge Retard!" );
            }
            else if(number1 == number2) {
                System.out.println(number1 +"er-Pasch!" );
            }
            else if(number2 == 2 && number1 == 1)  {
                System.out.println("Maexchen!");
            }
            else{
                System.out.println("Zahl ist: "+ number2 + number1);
            }
        }
        else{
            System.out.println("Falsche Zahlen Retard!" );
        }
	} 
}
