import java.util.Scanner;

public class PerfectGroups {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Anzahl an Personen");
        int countPerson = in.nextInt();
        if(countPerson <= 0) {
            System.out.println("Bitte eine realistische Zahl eingeben.");
        }
        else {
            int groups = countPerson / 2;
            int modulo = countPerson % 2;
            /* 
            System.out.println(groups);
            System.out.println(modulo);
            */
            if(countPerson == 1){
                System.out.println("Die "+ countPerson +" Person wurde in "+ groups +" 2er-Gruppe aufgeteilt. Es konnte keine 2er-Gruppe gebildet werden."); 
            }
            else if(countPerson == 2){
                System.out.println("Die "+ countPerson +" Personen wurde in "+ groups +" 2er-Gruppe aufgeteilt.\nPerfekte Aufteilung! "); 
            }
            else if(modulo == 1) { 
                System.out.println("Die "+ countPerson +" Personen wurden in "+ groups +" 2er-Gruppen aufgeteilt. Eine Person muss alleine arbeiten.");
            }
            else{
                System.out.println("Die "+ countPerson +" Personen wurden in "+ groups +" 2er-Gruppen aufgeteilt. \nPerfekte Aufteilung!");
            }
        }
    }
}
//by Viet Hung Ly