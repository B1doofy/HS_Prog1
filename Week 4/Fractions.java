public class Fractions {
    public static void main(String args[]){
        //zahl1 soll immer kleiner als zahl 2 sein
        int zahl1 = 24;
        int zahl2 = 36;
        System.out.println(greatestCommonFactor(zahl1, zahl2));
        printReduced(zahl1, zahl2);
        add(3,4,5,6);
    }
    public static int greatestCommonFactor(int a, int b){

        /* swith a and b if b > a; Does not work with the other methods lol-
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }*/
        while(b != 0){
            int rest = a % b;
            a = b;
            b = rest;
        }
        return a;
    } 

    public static void printReduced(int zähler, int nenner){
        int ggT = greatestCommonFactor(zähler, nenner);
        if(ggT != 1){
            zähler = zähler / ggT;
            nenner = nenner / ggT;
        }

        System.out.println( zähler+"/"+nenner);
    }

    public static void add(int zähler1,int nenner1,int zähler2,int nenner2){
        int neuZähler1 = zähler1 * nenner2;
        int neuZähler2 = zähler2 * nenner1;

        int neuZähler = neuZähler1 + neuZähler2;
        int neuNenner = nenner1 * nenner2;
        
        printReduced(neuZähler, neuNenner);
    }
}
