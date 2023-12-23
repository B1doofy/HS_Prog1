public class ChristmasBush {  
  public String[] gifts;
  public static int lights = 0;  
  public static ChristmasBush theOne = null;
  public static ChristmasBush theOther = null;
  private ChristmasBush(String[] hangingGifts, int lights) {
    this.gifts = hangingGifts;
    ChristmasBush.lights += lights;
  }
  public static ChristmasBush getInstance(boolean theFirst) {
    if (ChristmasBush.theOne == null) {
      ChristmasBush.theOne = new ChristmasBush(new String[] {"Lebkuchen", "FairPhone", "Javabuch"}, 120);
    }
    if (ChristmasBush.theOther == null) {
      ChristmasBush.theOther = new ChristmasBush(new String[] {"Zimtsterne", "PS5"}, 210);
    }
    return theFirst ? ChristmasBush.theOne: ChristmasBush.theOther;
  }
  public static void main(String[] ignoreArgs) {
    int lights = ChristmasBush.lights;
    int gifts = ChristmasBush.getInstance(false).gifts.length;
    int sum = lights + gifts;
    System.out.println(sum);
  }
}