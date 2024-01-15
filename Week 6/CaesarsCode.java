// created by Prog1-Team
// Sceleton file to use as a base

public class CaesarsCode {
  public static void main(String[] args) {
    // Key and text to encrypt are read from start arguments (or program ends directly)
    if (args.length != 2) {
      System.out.println("Missing text and key arguments");
	return;
    }
    String keyPhrase = args[0];
    String text = args[1];

    // test cases are already implemented and main is 'done'
    char[] key = getKey(keyPhrase);

    System.out.println(encrypt(text, key));
    System.out.println(decrypt(encrypt(text, key),key));
  }                  
  
   
  public static char[] getKey(String key) {
    char[] result = new char[256];
    if(key.length() != 26){
      System.out.println("Key is not viable. Key has to be length 26");
      return null;
    }
    else{
      for(int i = 65; i <= 90; i++){
        int j = i-65;        
        result[i] = key.charAt(j);
      }
    }
    return result;
  }
  
  public static String encrypt(String text, char[] key) {
    String result = "";
    
    return result;
  }
  
  public static String decrypt(String cipher, char[] key) {
    String result = "";
    // your code here...
    return result;
  }    
}
