public class LL {
    private int size;

    LL(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    Node head;

    //add-first
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        
        newNode.next=head;
        head=newNode;
    }

    //add-last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
       
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    //print
    public void printList(){
        if(head==null){
            System.out.println("LinkList is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    //delete-first
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    //delete-last
    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        size--;
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
     
    }

    public int getSize(){
        return size;
    }

    //reversing linkedlist
    public void reverse(){
        if(head==null||head.next==null){
            return;
        }

        Node previous=head;
        Node current=head.next;
        while(current!=null){
            Node next=current.next;
            current.next=previous;
            //updates
            previous=current;
            current=next;
        }
        
        head.next=null;
        head=previous;
    }


    public static void main(String[] args) {
        LL list=new LL();
        list.addLast("last");
        list.addFirst("first");
        list.addLast("last");
        list.addFirst("first");
        list.addFirst("is");
        
        list.deleteLast();
        list.deleteLast();
        list.printList();
        System.out.println(list.size);
        System.out.println(list.getSize());
        list.printList();
        list.reverse();
         list.printList();

        
    }

}
