public class Tombola {
    public static void main(String[] args){
        int a = 5;
        int b = 5;
        int c = 5;

        System.out.println(calculateTombolaPrize(3,3,3));
        System.out.println(calculateTombolaPrize(a,b,c));
        System.out.println(calculateTombolaPrize(1,2,3));
        System.out.println(calculateTombolaPrize(1,2,1));
    } 

    public static int calculateTombolaPrize(int draw1, int draw2, int draw3){
            if(draw1 == 3 && draw2 == 3 && draw3 == 3){
                return 10;
            }
            if(draw1 == draw2 &&  draw3 == draw2){
                return 5;
            }
            if(draw1 != draw2 && draw1 != draw3 && draw2 != draw3){
                return 1;
            }
            return 0;
        }
}
//by Viet Hung Ly