import java.util.Arrays;

public class cellInFloor {
    public static void main(String[] args) {
        int arr[]={5, 6, 8, 9, 6, 5, 5, 6};
        //int x=7;
        //int arr[]={5, 6, 8, 8, 6, 5, 5, 6};
        //int arr[]={80,59,26,46};
        int x=10;

        Arrays.sort(arr);
        int i=0;
        while(i<=arr.length-1){
            if(arr[i]>=x){
                System.out.print("cell="+arr[i]);
                System.out.println("floor="+arr[i-1]);
                break;
            }
            else if(arr[i]<=x){
                System.out.print("floor="+arr[i]);
                System.out.println("cell="+arr[i-1]);
                break;
            }
            i++;
        }
     
      
    }
}
