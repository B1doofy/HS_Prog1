import java.util.Scanner;

public class MiniDonuts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wie viele Einzelpackungen von Donuts gibt es?");
        int small = in.nextInt();
        System.out.println("Wie viele Großpackungen von Donuts gibt es?");
        int big = in.nextInt();
        System.out.println("Wie viele Minidonuts sollen insgesamt gekauft werden?");
        int n = in.nextInt();
        int sumDonuts = n;
        if(n <= 0 ) {
            System.out.println("Bitte eine realistische Zahl eingeben. Wenn man weniger als 1 Donuts kaufen will, geht man nicht einkaufen.");
        }
        else{
            for (int i=0; i < big && sumDonuts >= 5; i++) {
                sumDonuts = sumDonuts - 5;
            }
            if (sumDonuts > small){
                System.out.println("geht nicht.");
            }
            else {
                System.out.println("Wenn der Laden "+big+" Großpackungen hat und " + small +" Kleinpackungen, dann müssen Sie" );
                int requiredBigs = 0;
                int restDonuts = n;
                if(n <= big*5) {        
                    while (restDonuts >= 5) {
                        restDonuts = restDonuts - 5;
                        requiredBigs ++;
                    }
                System.out.println(requiredBigs +" Großpackungen und "+ restDonuts +" Kleinpackungen kaufen für "+ n + " Minidonuts.");  
                }
                else{
                    restDonuts = restDonuts- big*5;
                    System.out.println(big +" Großpackungen und "+ restDonuts +" Kleinpackungen kaufen für "+ n + " Minidonuts.");  
                }
            }   
        }
    }
}
