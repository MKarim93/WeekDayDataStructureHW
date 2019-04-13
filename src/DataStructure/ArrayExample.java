package DataStructure;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {

        String[] studentName = {"John", "Tom", "Jason", "Taylor"};
        for(int j=0; j<studentName.length; j++){
            System.out.println(studentName[j]);
        }

        int[] examScore = {98, 100, 97, 95};

        String studentFavColor[] = new String[4];
        studentFavColor[0]="Blue";
        studentFavColor[1]="Red";
        studentFavColor[2]="Green";
        studentFavColor[3]="Black";
        for(int i=0; i<studentFavColor.length; i++){
            System.out.println(studentFavColor[i]);
        }

        //System.out.println(Arrays.toString(studentName));
        //System.out.println(studentFavColor[0]);
        //System.out.println(studentFavColor[1]);
        //System.out.println(studentFavColor[2]);
        //System.out.println(studentFavColor[3]);
        System.out.println(Arrays.toString(examScore));
    }
}
