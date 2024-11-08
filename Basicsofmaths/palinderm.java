public class palinderm {
    public static void main(String[] args) {
        int n=-121;
        int n1=n;
        int reverse=0;
        while(n1>0){
            int digit=n1%10;
            n1=n1/10;
            reverse=reverse*10+digit;
        }
        System.out.println(reverse);
        if(n==reverse){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
