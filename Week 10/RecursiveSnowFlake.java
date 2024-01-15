// created by J. Konert
public class RecursiveSnowFlake {
    public static void main(String[] args) {
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.point(0.5, 0.5);
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.line(0.2, 0.1, 0.8, 0.1); 
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(StdDraw.BLACK);      
        
        // snowflake center is (x,y), length of lines "l"
        double x = 0.5;
        double y = 0.5;
        double len = 0.2;
        double a = 0.5 * len;
        double b = 0.5 * Math.sqrt(3) * len;                          
        drawStar(x,y,len);

    }
    /* this method draws a 6 ray star recursive*/
    public static void drawStar(double x, double y, double len) {        
        // a and b are calculated for the four endpoints of the star that are not horizintal or vertical
        double a = 0.5 * len;
        double b = 0.5 * Math.sqrt(3) * len;               
        StdDraw.line(x,y+len,x,y-len);
        StdDraw.line(x+b,y+a,x-b,y-a);
        StdDraw.line(x-b,y+a,x+b,y-a); 
        // recursion as long as length is > 0.005
        if (len/3.0d > 0.005) {            
            drawStar(x,y+len,len/3);
            drawStar(x,y-len,len/3);
            drawStar(x+b,y+a,len/3);
            drawStar(x-b,y+a,len/3);
            drawStar(x+b,y-a,len/3);
            drawStar(x-b,y-a,len/3);     
        }
    }
}