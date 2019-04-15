package NestedClass;

public class SchoolInfo {

    String schoolName;
    String schoolAddress;

    public SchoolInfo(String schoolName, String schoolAddress){
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
    }

    static class StudentInfo {

         String studentName;
         int studentGradeLevel;

         public StudentInfo(String studentName, int studentGradeLevel){
             this.studentName = studentName;
             this.studentGradeLevel = studentGradeLevel;
         }

    }
}
