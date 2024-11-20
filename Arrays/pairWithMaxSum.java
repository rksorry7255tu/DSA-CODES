public class pairWithMaxSum {
    public static void main(String[] args) {
        //int arr[] = { 4, 3, 1, 5, 6 };
        int arr[]={5, 4, 3, 1, 6};
        int maxSum=0;
        int sum=arr[0];
        int i=1;int j=0;
        while(i<arr.length&& j<=i){
            sum=sum+arr[i];
            maxSum=Math.max(maxSum, sum);
            sum=sum-arr[j];
            j++;
            i++;
        }
        System.out.println(maxSum);
    }
}
