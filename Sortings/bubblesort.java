public class bubblesort {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};

        for(int i=0;i<arr.length-1;i++){
            int didswap=1;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didswap++;
                }
            }
            if(didswap==0){
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
