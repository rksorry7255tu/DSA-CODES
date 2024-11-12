public class check {
    public static void main(String[] args) {
        //check if array is sorted or not
        int arr[]={1,2,3,1};
        int index=-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }

       
    }
}
