public class binarySearch {
    public static void main(String[] args) {

        //Normal approach
        int arr[]={-1,0,3,4,5,9,12};

        int target=12;
        int i=0;
        int j=arr.length-1;
        int index=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(target>mid){
                i=mid+1;
            }
            if(target<mid){
                j=mid-1;
            }
            if(target==arr[mid]){
                index=mid;
                break;
            }
        }
        System.out.println(index);
    }
}
