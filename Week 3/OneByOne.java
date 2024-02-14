import java.util.Scanner;

public class OneByOne {
    public static void main(String[] args) {
        System.out.print("Geben Sie eine positive Integerzahl ein: ");
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        int sysoutDecimal = decimal;
        int count = 0;

        if(decimal < 0){
            System.out.println("Bitte nur eine positive Int eingeben");
        }
        else{
            while(decimal != 0){
                // Überprüfen, ob das letzte Bit gleich 1 ist. bei 8 1000 & 1. Bei 1023 1111111111 & 1
                //System.out.println((decimal & 1));
                //System.out.println(decimal);
                if((decimal & 1) == 1){
                    count++;

                }
                // Bit Shift, Rechtes Bit entfernen (Shift nach rechts), Bei 8 1000 -> 100 (4). Bei 1023 1111111111 -> 111111111. Beim letzten shift wird es zu 0. Dann Ende
                decimal = decimal >> 1;
                //System.out.println((decimal));

            }
        System.out.println("Die Anzahl der Einser in der binären Darstellung von " + sysoutDecimal + " ist: " + count);   
        }
    } 
}
//by Viet Hung Ly