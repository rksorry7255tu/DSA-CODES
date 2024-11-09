import java.util.ArrayList;

public class factorial {
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> list=new ArrayList<>();
        // for(int i=1;i<n;i++){
        //     System.out.println(i);
        //     // if(factorial(i)>n){
        //     //     break;
        //     // }
        //     if(factorial(i)<=n){
        //         list.add(factorial(i));
        //     }else{
        //         break;
        //     }
        // }
        int i=1;
        while(factorial(i)<=n){
            System.out.println(i);
            list.add(factorial(i++));
        }
        System.out.println(list);
    }
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
