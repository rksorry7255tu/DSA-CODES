public class sumofFirstNno {
    public static void main(String[] args) {
        int n=4;
       System.out.println(sum(n));
      
       
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
        
    }
 
}
