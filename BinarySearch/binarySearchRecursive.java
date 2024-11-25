public class binarySearchRecursive {
    public static void main(String[] args) {

        //recursive approatch
        int arr[]={-1,0,3,4,5,9,12};
        int target=12;
        binary(0, arr.length-1, target, arr);

    }
    public static void binary(int start,int end,int target,int arr[]){
        int mid=(start+end)/2;
        if(target==arr[mid]){
            System.out.println("target found at:"+mid);
            return ;
        }else if(target>arr[mid]){
            binary(mid+1, end, target, arr);
        }
        else if(target<arr[mid]){
            binary(start, mid-1, target, arr);
        }  
    }
}
