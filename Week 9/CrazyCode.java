public class CrazyCode {

    private int buh;
    private int ah;                 
    public static int counter;    
    public CrazyCode() {                   
        this(1, 1);
    }
    public CrazyCode(int a, int b) {       
        this.buh = a;
        this.ah = b;
        counter++;
    }
    public void inc() {            
        this.buh = this.buh + CrazyCode.counter;        
    }
    public void dec() {                    
        this.ah = this.buh - CrazyCode.counter;         
    }
    public void print() {          
        System.out.println(this.ah + this.buh);
    }    
    public static void main(String[] args) {
        CrazyCode a = new CrazyCode();        
        a.inc();
        
        CrazyCode b = new CrazyCode(3, 7);
        b.inc();
        a.dec();
        CrazyCode c = new CrazyCode(4711, 007);
        b.dec();
        a.print();
        b.print();
        
    }
}