public class ChristmasTree {
    public static void main(String[] args){
        for(int i=1; i <= 60; i++){
            if(i>55){
                System.out.println("XXXXXXXXXX");
            }
            else{
                for(int j =1; j <=i && j<=30 ;j++){
                    System.out.print("x");
                }
                System.out.println();
            }
        }
    }
    
}
