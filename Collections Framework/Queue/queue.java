class queue{

    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        Queue(int n){
            arr=new int[n];
            this.size=n;
        }
        //add -enqueue
        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }
            size++;
            rear++;
            arr[rear]=data;
        }

        //remove
        public static int  remove(){
            if(rear==-1){
                System.out.println("empty queue");
                return -1;
            }
            size--;
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek(){
            if(rear==-1){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }

        //display
        public void display(){
            if(rear==-1){
                System.out.println("queue is empty");
                return;
            }
            for(int i=0;i<=rear;i++){
                System.out.println(arr[i]);
            }
        }
        
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.display();
    }
}