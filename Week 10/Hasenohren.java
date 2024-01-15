public class Hasenohren {
    public static void main(String[] args) {
        System.out.println(bunnyEars(0));
        System.out.println(bunnyEars(1));
        System.out.println(bunnyEars(2));
        System.out.println(bunnyEars(3));
        
    }

    public static int bunnyEars(int bunnies){
        if(bunnies < 0){
            System.out.println("Retard");
            return 0;
        }
        
        if(bunnies == 0){
            return 0;
        }

        if(bunnies % 2 == 0){
            return 3 + bunnyEars(bunnies - 1);
        }

        return 2 + bunnyEars(bunnies - 1);
    }
    
}
