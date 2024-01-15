public class Reindeer{
    private static int numberOfReindeer = 0;
    private int age;

    public Reindeer(int age){
        this.age = age;
        numberOfReindeer++;
    }
    public boolean isHappy(){
        return (numberOfReindeer % 2 == 0) || (age > 12);
    }
}