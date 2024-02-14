public class TestYUUUUUUUUU {
    public static void main(String[] args) {
        boolean [] arr = new boolean[10];
        int counter = 0;

        System.out.println("Before Change");
        for(int i = 0;i< arr.length ; i++){
            System.out.println(arr[i]);
            if(arr[i]==false){
                counter ++;

            }
        }
        System.out.println(counter);

        arr[0] = true;
        arr[1] = false;
        arr[9] = true;
        arr[arr.length-1] = false;
        int counter2 = 0;
        System.out.println("\nAfter Change");
        for(int j = 0;j< arr.length ; j++){
            System.out.println(arr[j]);
            if(arr[j]==false){
                counter2 ++;
            }
        }
        System.out.println(counter2);

    }
    
}
