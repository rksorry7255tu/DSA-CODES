public class noofSubArrayXor {
    public static void main(String[] args) {
        //bruteforce solutions
        int a[]={4, 2, 2, 6, 4};
        //int a[]={5, 6, 7, 8, 9};
        int b=6;
        int max=0;
        if(a[0]==b){
            max++;
        }
        for(int i=0;i<a.length;i++){
            int xor=a[0];
            for(int j=i+1;j<a.length;j++){
                xor=xor^a[j];
                if(xor==b){
                    max++;
                }
            }
        }
        System.out.println(max);
    }
}
