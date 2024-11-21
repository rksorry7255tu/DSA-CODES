public class spiralMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        int ul=0;
        int ur =0;
        int lr=arr.length-1;
        int ll=arr.length;

        int i=0;
        while(i<arr.length){
           for(int j=ul;j<=lr;j++ ){
            System.out.print(arr[ul][j]+" ");
           }
           ur++;
           for(int j=ur;j<=lr;j++){
                System.out.print(arr[lr][j]);
           }
           lr--;




           i++;
           break;
        }
    }
}
