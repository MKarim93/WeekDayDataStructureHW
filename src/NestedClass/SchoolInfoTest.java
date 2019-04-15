package NestedClass;

import java.util.LinkedList;
import java.util.List;

public class SchoolInfoTest {

    public static void main(String[] args) {
        List<SchoolInfo.StudentInfo> list = new LinkedList<>();

        SchoolInfo.StudentInfo student1 = new SchoolInfo.StudentInfo("Jeff Bezos", 10);
        SchoolInfo.StudentInfo student2 = new SchoolInfo.StudentInfo("Bill Gates", 10);
        SchoolInfo.StudentInfo student3 = new SchoolInfo.StudentInfo("Donald Trump", 10);
        SchoolInfo.StudentInfo student4 = new SchoolInfo.StudentInfo("Steve Jobs", 10);
        SchoolInfo.StudentInfo student5 = new SchoolInfo.StudentInfo("Elon Musk", 10);
        SchoolInfo.StudentInfo student6 = new SchoolInfo.StudentInfo("Chris Rock", 10);

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
        for(SchoolInfo.StudentInfo s:list){
            System.out.println(s.studentName+" "+s.studentGradeLevel);
        }




    }
}
