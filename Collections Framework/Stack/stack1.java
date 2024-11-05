import java.util.*;
class stack1{

    //Stack using ArrayList

    static class Stack{
        ArrayList<Integer> list=new ArrayList<>();
        int size=0;
        //push
        public void push(int data){
            list.add(data);
            size++;
        }

        //pop
        public int pop(){
            if(list.size()==0){
                return -1;
            }
            size--;
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public int peek(){
            if(list.size()==0){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }

    public static void main(String[] args) {
       Stack s=new Stack();
       s.push(1);
       s.push(2);
       s.push(3);
       //System.out.println(s.size);
    //    for(int i=0;i<s.size;i++){
    //     System.out.println(s.peek());
    //     s.pop();
    //    }
    //    System.out.println(s.peek());
       System.out.println(s.pop());
    }
}