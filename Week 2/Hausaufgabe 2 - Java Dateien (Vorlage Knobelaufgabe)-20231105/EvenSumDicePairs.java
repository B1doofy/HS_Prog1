public class EvenSumDicePairs {
    public static void main(String[] args) {
        System.out.println("Hier sind alle geraden Augenpaare, wo die Zahl vom Würfel1 kleiner gleich die Zahl vom Würfel2 ist:");
        for( int i=1;i <=6;i++){
            for(int j=1;j <=6;j++){
                if((i+j) % 2 == 0 && i<= j){
                    System.out.println("("+i+","+j+")");
                }
            }
        }
    }
}
//(1,1),(1,3),(1,5),(2,2),(2,4),(2,6),(3,3),(3,5),(4,4),(4,6),(5,5),(6,6)