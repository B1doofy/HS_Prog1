public class Skalarprodukt {
    public static void main(String args[]){
        int[] scalar1 = {1,2,3,4};
        int[] scalar2 = {4,3,2,1};
        int[] scalar3 = {1,2,3};
        System.out.println(scalarProduct(scalar1, scalar2));
        System.out.println(scalarProduct(scalar1, scalar3));
    }

    public static int scalarProduct(int[] vectorA, int[] vectorB){
        int result = 0;
        if( vectorA == null || vectorB == null || vectorA.length != vectorB.length){
            return 0;
        }
        for(int index = 0; index < vectorA.length; index++){
            result = result + vectorA[index] * vectorB[index];
        }
    return result;
    }  
}
//by Viet Hung Ly