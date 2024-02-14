public class Slotmaschine {
    public static void main(String[] args){
        int a = 5;
        int b = 5;
        int c = 5;

        System.out.println(getSlotResult(a,b,c));

    } 
    public static int getSlotResult(int draw1, int draw2, int draw3){
            if(draw1 == draw2 && draw2 == draw3){
                return 20;
            }
            if(draw1 == draw2 || draw1 == draw3 || draw3 == draw2){
                return 10;
            }
            return 0;
        }
}
//by Viet Hung Ly