public class maxSubArray {
    public static void main(String[] args) {
        int arr[]={10, 5, 2, 7, 1, 9};
       int k=15;
       int  length=0;
       for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int l=i;l<j;l++){
                    sum=sum+arr[l];
                }
                if(sum==k){
                    length=Math.max(length,j-i+1);
                }
            }
       }
       System.out.println(length);
       
    }
}
