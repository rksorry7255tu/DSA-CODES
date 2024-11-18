public class subArray {
    public static void main(String[] args) {

        //just only for +ve n0s
        
        //int arr[]={10, 5, 2, 7, 1, 9};
        int arr[]={-1, 2, 3};
        //int arr[]={1, -1, 5, -2, 3};
        int  k = 6;
        int i=0;int j=0;
        int sum=0;
        int max=0;
        while(i<arr.length){
            while(j<=i&&sum>k){
                sum=sum-arr[j];
                j++;
            }
            if(sum==k){
                max=Math.max(max, i-j+1);
            }
            if(i<arr.length){
                sum=sum+arr[i];
                i++;
            }
        }
        System.out.println(max);
        
    }
}
