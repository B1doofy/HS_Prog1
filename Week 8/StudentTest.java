public class StudentTest {
  public static void main(String[] ignoredArgs) {
    Student susan = new Student("Susan Glow", 'd', "susan.glow@cs.hs-fulda.de", 2);
    Student lara = new Student("Lara Müller", 'f', "lara.mueller@cs.hs-fulda.de", 1);
    Student pieter = new Student("Pieter Ornov", 'm', "pieter.Ornov@cs.hs-fulda.de", 8);
    Student clara = new Student("Clara de Manielle", 'f', "clara.de-manielle@cs.hs-fulda.de", 3);
    
    boolean checkSusan = susan.getSemesters() == 2 && susan.isGender('d') && !susan.isGender('f');
    boolean checkLara = lara.getSemesters() == 1 && lara.isGender('f') && !lara.isGender('m');
    boolean checkPieter = pieter.getSemesters() ==8 && pieter.isGender('m') && !pieter.isGender('d');

    boolean checkIDs = susan.getID() != lara.getID();    
    boolean checkLastID = clara.getID() == Student.getLastID();
        
    System.out.println(checkSusan && checkLara && checkPieter && checkIDs && checkLastID ? "all Tests passed!": "Test failed! See sourcecode for details.");    

  }
}