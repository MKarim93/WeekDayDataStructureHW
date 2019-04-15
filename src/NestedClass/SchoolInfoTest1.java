package NestedClass;

import java.util.LinkedList;
import java.util.List;

public class SchoolInfoTest1 {

    public static void main(String[] args) {
        List<SchoolInfo1.StudentInfo> list = new LinkedList<>();

        SchoolInfo1.StudentInfo student1 = new SchoolInfo1.StudentInfo("Jeff Bezos", 10);
        SchoolInfo1.StudentInfo student2 = new SchoolInfo1.StudentInfo("Bill Gates", 10);
        SchoolInfo1.StudentInfo student3 = new SchoolInfo1.StudentInfo("Donald Trump", 10);
        SchoolInfo1.StudentInfo student4 = new SchoolInfo1.StudentInfo("Steve Jobs", 10);
        SchoolInfo1.StudentInfo student5 = new SchoolInfo1.StudentInfo("Elon Musk", 10);
        SchoolInfo1.StudentInfo student6 = new SchoolInfo1.StudentInfo("Chris Rock", 10);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        //.remove methods takes away from list
        list.remove(student3);
        list.remove(student4);
        list.remove(student5);
        list.remove(student6);
        for(SchoolInfo1.StudentInfo s:list){
            System.out.println(s.studentName+" "+s.studentGradeLevel);
        }
    }
}
