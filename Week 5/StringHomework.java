public class StringHomework {
    public static void main(String[] args){
        //isPalindrome checks
        System.out.println("Palidrome checks");
        System.out.print("Abba: ");
        System.out.println(isPalindrome("Abba"));
        System.out.print("Legovogel: ");
        System.out.println(isPalindrome("Legovogel"));
        System.out.print("H: ");
        System.out.println(isPalindrome("H"));
        System.out.print("Hung: ");
        System.out.println(isPalindrome("Hung"));
        System.out.print("<Empty String> \"\": ");
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome(null)); 
        //null klappt nicht, Methode fordert ein String
        //leerer String und ein Char Strings sind Palindrome

        System.out.println("\nAnagram Checks");
        System.out.print("betrug und geburt ");
        System.out.println(checkForAnagram("betrug", "geburt")); 
        System.out.print("tom marvolo riddle und  i am lord voldemort " );
        System.out.println(checkForAnagram("tom marvolo riddle", "i am xxxx voldemort"));
        System.out.print("Hung und Ly ");
        System.out.println(checkForAnagram("Hung", "Ly"));
        System.out.print("\"\" und \"\" ");
        System.out.println(checkForAnagram("", ""));
    }

    public static boolean isPalindrome(String s){
        //nicht case sensitive
        if(s == null){
            System.out.println("null ist auch ein Palindrome.");
            return false;
        }
        //Empty string ist kein Palindrome
        if(s== ""){
            return false;
        }
        String cleanString = s.toLowerCase();
        int length = cleanString.length();
        //Schleife , length / 2(div 2), bei ungerade ist der mittlerste Char irrelevant, 
        for(int i = 0; i < length / 2; i++){
            if(cleanString.charAt(i) != cleanString.charAt(length - 1 - i)){
                return false;
            }
        }
        return true;  
    }

    public static boolean checkForAnagram(String s1, String s2){
        //ginge unkomplizierter wenn ich die zwei Strings in CharArrays umwandel, die sortiere und dann vergleiche
        //replaceAll mit Regex (Regular Expressions), Mustererkennung, hier: //s sind alle leerzeichen, Tabs und zeielnumbrüche im String und die ersetze ich mit einem leerem String
        String cleanS1 = s1.replaceAll("\\s+", "");
        String cleanS2 = s2.replaceAll("\\s+", "");

        if(cleanS1.length() == cleanS2.length()){
            for(int j = 0; j < cleanS1.length(); j++){
                
                char compCharS1 = cleanS1.charAt(j);
                int indexS2 = cleanS2.indexOf(compCharS1);
                //wenn Char von S1 nicht in S2, dann gibt indexOf -1 an

                if(indexS2 != -1){
                    //man kann bei einen String nicht direkt per index löschen. Baue zwei substrings und lasse den Char beim Index raus
                    cleanS2 = cleanS2.substring(0, indexS2) + cleanS2.substring(indexS2 +1);
                } 
                else{
                    //Char von S1 ist nicht in S2 -> keine Anagram
                    return false;
                }
            } 
            //Länge gleich und alle Chars von S1 in S2 -> Anagram
            return true; 
        }
        //Länge stimmt schon net -> kein anagram
        return false;
    }
}