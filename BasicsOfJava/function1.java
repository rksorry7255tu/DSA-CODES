import java.util.*;
public class function1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        String  str=sc.nextLine();
        String result="res";
        switch(str){
            case "Character": result="1";
            System.out.println(result);
            break;
            case "Integer": System.out.println("2");
            break;
            default : System.out.println("invalid");
        }
    }
}
