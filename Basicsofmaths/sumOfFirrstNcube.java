public class sumOfFirrstNcube {
    public static void main(String[] args) {
        long n=5;
        System.out.println(sum(n));
    }
    public static  long sum(long n){
        if(n==0){
            return 0;
        }else{
            return (n*n*n)+sum(n-1);
        }
    }
}
