public class NestParent {
    public static void main(String args[]){
        System.out.println(checkNestParent("(())"));
        System.out.println(checkNestParent(""));
        System.out.println(checkNestParent("(())))"));
        System.out.println(checkNestParent("(((x+y)))"));
        System.out.println(checkNestParent("((()()))")); 
    }

    public static boolean checkNestParent(String s){
        if(s == null || s.length() < 1){
            return true;
        }
        if(s.charAt(0) == '(' && s.charAt(s.length()-1) == ')'){
            String newS = s.substring(1, s.length() -1);
            return checkNestParent(newS);
        }
        return false;
    } 
}
