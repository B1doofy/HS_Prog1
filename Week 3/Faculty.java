import java.util.Scanner;

public class Faculty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long result = 1;
        for(int i = 1; i <= n ; i++){
            if(Long.MAX_VALUE/i >result) {
                result = result * i; // Compilier schaut von links nach rechts. Er schaut die linke Variable an. Das ist long und wandelt die rechte Variable in ein long um. Wenn n* result dann kommt Fehler. Umgehen kann man das mit casten
            }
            else{
                System.out.println("Überlauf bei "+ i);
                break;
            }
        }
        System.out.println(result);
    }
}
