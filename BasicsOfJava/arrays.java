import java.util.*;

public class arrays {
    public static void main(String[] args) {
        //Arrays

        int marks[]=new int[3];
        System.out.println(marks[2]=3);
        marks[0]=0;
        marks[1]=4;
        marks[2]=2;
        Arrays.sort(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println(marks.length);
        int mark[][]={{1,2,3},{4,5},{6,7,8,9}};
        System.out.println(mark[0][0]);
        



    }
}
