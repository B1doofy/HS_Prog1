public class QuizLuckySum {
    public static void main(String[] args){
        
        System.out.println(luckySum(1,2,3));
        System.out.println(luckySum(1,2,13));
        System.out.println(luckySum(1,13,13));
        System.out.println(luckySum(13,2,3));
    } 

    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a != 13){
            sum = sum + a;
            if(b != 13){
                sum = sum + b;
                if(c != 13){
                    sum = sum + c;
                }
            }
        }
        return sum;
    }

}
//by Viet Hung Ly