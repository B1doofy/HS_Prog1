public class Pair {
    private int first;
    private int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int first() {
        return first;
    }

    public int second() {
        return second;
    }

    public void swap() {
        int temp = first;
        first = second;
        second = temp;
    }

    public void add(Pair other) {
        this.first += other.first;
        this.second += other.second;
    }
}