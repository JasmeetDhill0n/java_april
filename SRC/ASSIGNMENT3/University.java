package ASSIGNMENT3;

public class University {
    //Class: University o Static Fields: ▪ universityName (String) ▪ totalStudents (int) ▪
    // totalProfessors (int). o Static Methods: ▪ setUniversityName(String name):
    // Sets the university name. ▪ incrementStudentCount(): Increments the totalStudents counter.
    // ▪ incrementProfessorCount(): Increments the totalProfessors counter. ▪
    // getStatistics(): Returns the university name, total students, and total professors.

   static String universityName;
   static int totalStudent;
   static int totalProfessor;

  public  static void setUniversityName(String name){

      universityName = name;
   }
  public static  void incrementStudentCount(){

      totalStudent++;
   }
  public static void incrementProfessorCount(){
       totalProfessor++;
   }
 public static void getStatistics(){
    System.out.println("universityName- "+universityName);
    System.out.println("Total Student - "+totalStudent++);
    System.out.println("total profesor - "+totalProfessor++);
 }


}
