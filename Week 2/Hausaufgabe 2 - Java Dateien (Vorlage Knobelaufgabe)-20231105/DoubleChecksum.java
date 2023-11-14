import java.util.Scanner;

public class DoubleChecksum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int number = in.nextInt();
        if(number < 0){//(number < 10)
            System.out.println("Bitte eine Zahl größer als 0 eingeben, da Quersummen nur von positiven ganzen Zahlen berechnet werden kann.");
        }
        String numberString = Integer.toString(number);
        int result = 0;
        int index = numberString.length();
        //System.out.println(index);
        
        while (index > 0) {
            int endIndex = index;
            int startIndex = index - 2;
            //System.err.println(endIndex);
            //System.out.println(startIndex);
            if(startIndex <0){
                startIndex = 0;
            }
            String partNumber = numberString.substring(startIndex, endIndex);
            result = result + Integer.parseInt(partNumber);
            index = index - 2;
        }
        System.out.println("Die Zweier-Quersumme von Zahl "+number+ " ist "+result+".");
    }
}