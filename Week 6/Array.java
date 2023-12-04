public class Array {
    public static void main(String[] args){
        boolean[] arr = new boolean[10];
        arr[0] = true;
        arr[1] = false;
        arr[9] = true;
        arr[arr.length-1] = false;
        int count= 0;
        for(int i = 0; i <arr.length; i++){
            System.out.println(i);
            System.out.println(arr[i]);
            if(arr[i]== false){
                count++;
            }
        }
        System.out.println("Finaler count");
        System.out.println(count);
    }
    
}
