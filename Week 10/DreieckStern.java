public class DreieckStern {
    public static void main(String args[]){
        System.out.println(Dreieck(0));
        System.out.println(Dreieck(1));
        System.out.println(Dreieck(2));


    }

    public static int Dreieck(int zeilen){
        if(zeilen == 0){
            return 0;
        }

        int Sterne = zeilen;
        return (Sterne + Dreieck(zeilen - 1));
        //oder return zeilen + Dreieck(zeilen -1)

    }
}
