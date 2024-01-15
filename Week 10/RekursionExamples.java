//created by JK
public class RekursionExamples {

    public static String replaceAll(String text, String toReplace, String replacement) {
        if (text == null || toReplace == null || text.length() < toReplace.length()) {
            return text;
        }
        if (text.startsWith(toReplace)) {
            return replacement + replaceAll(text.substring(toReplace.length()), toReplace, replacement);
        }
        return text.charAt(0) + replaceAll(text.substring(1), toReplace, replacement);
    }

    public static String moveToEnd(String text, char toMove) {
        if (text == null || text.length() == 1) {
            return text;
        }
        if (text.charAt(0) == toMove) {
            return moveToEnd(text.substring(1), toMove) + toMove;
        }
        return text.charAt(0) + moveToEnd(text.substring(1), toMove);
    }
    public static void main(String[] args) {
        System.out.println(replaceAll("Ab sofort gilt in unserem Shop die Mwst von 16% solange bis die 16% wieder geändert werden.", "16%", "19%"));
        System.out.println(moveToEnd("Wenn x = x/y + y/x, dann muss y = x sein.", 'x'));
    }                
}
