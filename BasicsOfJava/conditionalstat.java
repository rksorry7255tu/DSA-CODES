import java.util.*;
public class conditionalstat {
    public static void main(String[] args) {
        while(true){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("Eligible for vote");
        }else{
            System.out.println("not eligible for vote");
        }

        //
        if(age>18){
            System.out.println("Eligible for vote");
        }else if(age>60){
            System.out.println("older");
        }else{
            System.out.println("not elligible");
        }
        int swch=age;
        //switch
        switch(swch){
            case 1:System.out.println("1="+age);
            break;
            case 2:System.out.println("2="+age);
            break;
            case 3:System.out.println("3="+age);
            break;
            case 4:System.out.println("4="+age);
            break;
            default:System.out.println("invalid options");
        }
    }
    }
}
