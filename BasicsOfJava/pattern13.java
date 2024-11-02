public class pattern13 {
    public static void main(String[] args) {
        
        for(int i=1;i<6;i++){
            int n=i;
            for(int j=1;j<6-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<i+1;k++){
               
                System.out.print(n--);
            }
            for(int l=1;l<i;l++){
                System.out.print(l+1);
            }
            System.out.println();
        }
    }
}
