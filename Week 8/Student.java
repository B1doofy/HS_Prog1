public class Student {

    private String name;
    private String email;
    private char gender = 'u';
    private long id;
    private int semesters;

    private static long lastID = 1000;

    public Student(String nameToSet, char gender, String email, int studyTerms){
        if( nameToSet != null && nameToSet.length() > 0){
            this.name = nameToSet;
        }
        else{
            System.out.println("Warning name is not valid");
        }

        if(gender == 'f' || gender == 'm'){
            this.gender = gender;
        }
        else{
            System.out.println("Warning gender is not valid");
        }

        if( email != null && email.length() > 0){
            this.email = email;
        }
        else{
            System.out.println("Warning email is not valid");
        }

        if(studyTerms >0){ //abgeschlossene Semster
            this.semesters = studyTerms;
        }
        else{
            System.out.println("Warning semesters is not valid");
        }
        Student.lastID++;
        this.lastID = id;

    }


    

    public boolean isGender(char gender){
        return this.gender == gender;
    }

    public long getID(){
        return this.id;
    }

    public static long getLastID(){
        return Student.lastID;
    }

    public int getSemesters(){
        return this.semesters;
    }

    
}
