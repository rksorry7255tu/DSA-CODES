public class pattern8 {
    public static void main(String[] args) {
        int a=1;
        for(int i=1;i<6;i++){
            for(int j=1;j<i+1;j++){
                System.out.print( a++ +" ");
            }
            System.out.println("  ");
        }
    }
}
