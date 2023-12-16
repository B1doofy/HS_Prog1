public class Test {

    public static void main(String[] args) {
        Pair p = new Pair(1, 2);
        System.out.println(p.second()); // 2
        p.swap();
        System.out.println(p.first()); // 2
        System.out.println(p.second());//1

    }


    
}
