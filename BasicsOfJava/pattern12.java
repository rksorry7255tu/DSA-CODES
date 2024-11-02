public class pattern12 {
    public static void main(String[] args) {
        
        for(int i=1;i<6;i++){
            for(int k=1;k<6-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
