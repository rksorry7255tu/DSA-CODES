public class Basics {
    public static void main(String[] args) {

        //extracting no
        int n=7789;
        while(n>0){
            int length=n%10;
            System.out.println(length);
            n=n/10;
        }
    }
}
