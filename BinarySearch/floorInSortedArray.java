public class floorInSortedArray {
    public static void main(String[] args) {
        //int arr[]={1, 2, 8, 10, 11, 12, 19};
        int arr[]={1,2,8};
        int k=1;
        int res=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                res=i;
            }
        }
        System.out.println(res);   
    }
}
