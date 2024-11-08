public class armstrongNo {
    public static void main(String[] args) {
        int n=371;
        //int n=1634;
        int n1=n;
        int amstrongno=0;
        while(n1>0){
            int digit=n1%10;
            n1=n1/10;
            amstrongno=amstrongno+(digit*digit*digit);
            System.out.println(amstrongno);
        }
        
        
        if(n==amstrongno)
        System.out.println("armstrongNo="+amstrongno);
        else
        System.out.println("not armstrong no");
    }
}
