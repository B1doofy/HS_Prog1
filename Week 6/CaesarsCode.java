public class CaesarsCode{
  public static void main(String[] args){
    if(args.length != 2){
      System.out.println("Missing text and key arguments");
      return;
    }

    String keyPhrase = args[0];
    String text = args[1];

    char[] key = getKey(keyPhrase);

    System.out.println(encrypt(text, key));
    System.out.println(decrypt(encrypt(text, key), key));
  }

  public static char[] getKey(String keyPhrase){
    if(keyPhrase.length() != 26){
      return null;
    }

    char[] replaceKeys = keyPhrase.toCharArray();
    char[] key = new char[256];
    for(char c = 0; c < 256; c++){
      key[c] = c;
    }

    System.arraycopy(replaceKeys, 0, key, 65, 26);

    return key;
  }

  public static String encrypt(String text, char[] key){
    char[] tArr = text.toCharArray();

    for(int c = 0; c < tArr.length; c++){
      tArr[c] = key[tArr[c]];
    }

    return new String(tArr);
  }

  public static String decrypt(String cipher, char[] key){
    char[] cArr = cipher.toCharArray();
    for(int i = 0; i < cArr.length; i++){
      for(char j = 0; j < key.length; j++){
        if(key[j] == cArr[i]){
          cArr[i] = j;
          break;
        }
      }
    }
    return new String(cArr);
  }
}
//by Viet Hung Ly