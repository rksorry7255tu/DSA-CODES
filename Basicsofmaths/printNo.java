public class printNo {
    public static void main(String[] args) {
        int n=10;
        int i=1;
       print(i, n);
    }
    public static void print(int i,int n){
        if(i==n){
            System.out.println(i);
            return;
        }
        System.out.println(i++);
        print(i, n);
    }
}
