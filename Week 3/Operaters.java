public class Operaters {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        boolean z = true;
        // Alle sysout einzeln ausführen
        //System.out.println(y++ * 5 + y); // Das y++ zieht erst bei dem nächsten Aufruf der Variablen, deshalb erst 2*5 +3
        //System.out.println(y * 5 % ++y );// Es geht vom links nach recht. 2* 5 % 3
        //System.out.println(y++ - y--); // 2- 3. das y-- ist im Speicher aber für hier nicht relevant
        //System.out.println(x * 5 < y || z && x > y); // false
        System.out.println(x = y = y +1); // Code geht vom links nach recht aber deklaration geht von rechts nach links x=3
    } 
}
//by Viet Hung Ly