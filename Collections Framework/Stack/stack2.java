public class stack2 {
    static class Node{
        int data;
        Node next;
        Node(int  data){
            this.data=data;
            this.next=null;
        }
    }

    static class Stack{

        Node head;
        //push
        public void push(int  data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        //pop
        public void pop(){
            if(head==null){
                return ;
            }
            head=head.next;
        }
        //peek
        public int peek(){
            if(head==null){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
