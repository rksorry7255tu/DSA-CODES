import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println(name);

        System.out.println("enter value of a");
        int a=sc.nextInt();
        System.out.println("enter value of b");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum="+sum);

    }
}
