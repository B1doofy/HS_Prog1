public class Quiz {
    public static void main(String[] args) {
        System.out.println(sumUneven(new int[] {1,2,3}));
        System.out.println(sumUneven(new int[] {2,4,6}));
        System.out.println(sumUneven(new int[] {}));
        System.out.println(sumUneven(new int[] {2,6}));


        
    }

    public static int sumUneven(int[] numbers) {
        int sum = 0;
        for(int i = 0; i<=numbers.length-1; i++){
            if(numbers[i] % 2 == 1){
                sum = sum +numbers[i];
            }
        }
        return sum;
    }   
}
