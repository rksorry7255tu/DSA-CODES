import java.util.*;

public class reverseStack {

    public static  void putAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        putAtBottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return ;
        }

        int top=s.pop();
        reverse(s);
        putAtBottom(top, s);
      
    }

    public static void reverse1(Stack<Integer> s){

    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        //Stack<Integer> s1=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);

        // //reverse
        // while(!s.isEmpty()){
        //     s1.add(s.peek());
        //     s.pop();
        // }

        // while (!s1.isEmpty()) {
        //     System.out.println(s1.peek());
        //     s1.pop();
        // }
        
      
       reverse(s);
       while (!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop();
       }
        
    }
}
