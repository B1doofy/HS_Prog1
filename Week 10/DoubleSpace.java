public class DoubleSpace{

    public static void main(String[] args) {
        /* 
        removeDoubleSpace("Programmierung  1").equals("Programmierung 1");    
        removeDoubleSpace("  42 = 42?").equals("42 = 42?");
        removeDoubleSpace("  So  soll  es  sein.  ").equals("So soll es sein.");
        removeDoubleSpace(null).equals("");  
        removeDoubleSpace("").equals("");
        removeDoubleSpace("  ").equals("");
        removeDoubleSpace(" ").equals(" ");
        removeDoubleSpace("A").equals("A");*/
        System.out.println(removeDoubleSpace("Programmierung  1"));
        System.out.println(removeDoubleSpace("  42 = 42?"));
        System.out.println(removeDoubleSpace("  So  soll  es  sein.  "));
        System.out.println(removeDoubleSpace(null));
        System.out.println(removeDoubleSpace(""));
        System.out.println(removeDoubleSpace("  "));
        System.out.println(removeDoubleSpace(" "));
        System.out.println(removeDoubleSpace("A"));
    }

    public static String removeDoubleSpace(String s) {
        if (s == null) {
            return "";
        }
        s = s.replaceAll("^\\s+", "");
        s = s.replaceAll("\\s+$", "");
        s = s.replaceAll("\\s+", " ");
        return s;
      }
}