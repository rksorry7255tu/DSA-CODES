class queueUsingLinkedList1 {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class queue {
        
       static Node head = null;
       static  Node tail = null;

        public static boolean isEmpty() {
            return head == null & tail == null;
        }

        // add
        public void add(int data) {
            Node newnode = new Node(data);
            if (tail == null) {
                tail = head = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;

        }

        // remove
        public int remove() {
            if (tail == null) {
                System.out.println("queue is empty");
                return -1;
            }
            int h = head.data;
            head = head.next;
            return h;
        }

        // peek
        public int peek() {
            if (tail == null) {
                System.out.println("queue is empty");
                return -1;
            }
            int h = head.data;
            return h;
        }

        public void display() {
            if (tail == null) {
                System.out.println("queue is empty");
                return;
            }
            Node temp = head;
            while (temp != tail) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {
        // queueUsingLinkedList1 q=new queueUsingLinkedList1();
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        // q.display();
        q.add(4);
        // q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}