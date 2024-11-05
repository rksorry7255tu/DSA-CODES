import java.util.Stack;
public class stack3 {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        for(int i=0;i<s.size()-1;i++){
            System.out.println(s.get(i));
        }
        System.out.println(s.isEmpty());
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.isEmpty());
    }
}
