public class insertionsort {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]<=arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
