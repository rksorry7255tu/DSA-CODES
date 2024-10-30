import java.util.*;
public class function {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name=sc.nextLine();
       int fac=sc.nextInt();
        // printName(name);
        // int sum=sum(1,2);
        // System.out.println("sum="+sum);
        // int mul=mul(1,2);
        // System.out.println("mul="+mul);
        System.out.println(facto(fac));
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int facto(int n){
        if(n==0||n==1){
            return 1;
        }else
        return n*facto(n-1);
    }

}
