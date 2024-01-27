public class AnagramCheck {
    public static void main(String[] args) {
        String input = "Hiho";
        String result = annagram(input);
        System.out.println(result);
    }

    public static String annagram(String text) {
        int length = text.length();
        int lengthComp = text.length();
        int i = 0;
        if(length == 1){
            text = text + text;
            return text;
        }
        while(i < length){
            int charLength = lengthComp - 1;
            text = text + text.charAt(charLength);
            lengthComp--;
            i++;
        }
        return text;
      }
    }

