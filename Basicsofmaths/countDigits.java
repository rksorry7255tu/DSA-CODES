public class countDigits {
    public static void main(String[] args) {
        int n=7789;
        int n1=n;
        int count=0;
        while(n1>0){
            int digit=n1%10;//2
           if(n%digit==0)
           count++;
            n1=n1/10;
        }
        System.out.println(count);
    }
}
