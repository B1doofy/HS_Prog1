import java.util.Scanner;

public class Passwort {
    public static void main(String[] args) {
        String password = "12345678";
        Scanner in = new Scanner(System.in);
        for( int i=1; i<=3; i++){
            System.out.println("Eingabe Passwort:");
            String inputPassword = in.nextLine();
            //System.out.println(password+ "\n" +inputPassword);
            //System.out.println(password==inputPassword);
            if(inputPassword.equals(password)){
                System.out.println("Login erfolgreich!");
                break;
            }
            else if(i == 3){
                System.out.println("Passwort wurde 3 mal falsch eingegeben. Gerät gesperrt");
                break;
            }
            else {
                int attemps = 3-i;
                System.out.println("Sie haben noch "+ attemps+" Versuche." );
            }
        }
    }
    
}
