//by Viet Hung Ly
import java.util.Scanner;

public class ForeverYoung {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Ihr Alter: ");
		int age = in.nextInt();
    if (age < 0) {
      System.out.println("Bitte eine richtige int eingeben für Ihr Alter.");
    }
    else if(age < 10 ) {
      System.out.println("Echt jetzt? Wow.");
    }
    else if (age <= 20) {
      System.out.println("Midlife-Crisis ist für Dich ein Fremdwort, nehme ich an");
    }
    else {
      System.out.println("Weisheit reift mit dem Alter, schätze ich.");
    }
  }
}
