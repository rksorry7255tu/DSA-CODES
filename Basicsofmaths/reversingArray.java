public class reversingArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,0};
        int size=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[size];
            arr[size]=temp;
            size--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        

    }
}
