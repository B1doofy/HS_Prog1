public class TESTYUUUUU {
    public static void main(String args[]){
        boolean notFound = true;
        char counter = 65;
        while (notFound) {
            counter++;
            String randomPassword = "";
            for (char i = 65; i < counter + 1; i++) {
                char c = i;
                randomPassword += c;
            }
        do {
            notFound = notFound && counter != 126 && tryPassword(randomPassword);
            int size = randomPassword.length();
            if (size == 1) {
                size = 2;
            }
            randomPassword = randomPassword.substring(size/2);
        } while(randomPassword.length() > 0);
        }

        
             class Student {
             public long id;
             public String name;
             private long created;
             private double[] grades;
             private Courses[] courses;
             private int semesters;
            
             public static long nextId;
             public static double[] avgGrades = new double[0];
             private static long numCreated;
            
             public Student(String name) {
             this.id = ++nextId;
             this.name = name;
             this.created = System.currentTimeMillis();
             this.grades = new double[0];
             Student.numCreated++;
             }
             }

    }
}
