public class minimumJump {
    public static void main(String[] args) {
         //int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        // int arr[]={1, 4, 3, 2, 6, 7};
        int arr[] = { 9, 10, 1, 2, 3, 4, 8, 0, 0, 0, 0, 0, 0, 0, 1 };
        int size = arr.length;
        int i=0;
        int sum=0;
        int count=0;
        while(i<arr.length){
            if(arr[i]==0){
                count=-1;
                break;
            }
            sum=sum+arr[i];
            System.out.println(sum);
            if(sum>=size){
                break;
            }
            i=i+arr[i]+1;
            count++;
            
        }
        System.out.println(count);
    }
}
