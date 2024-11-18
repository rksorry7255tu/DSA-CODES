public class maxSubArrayOptimize {
    public static void main(String[] args) {

        //this is the only optimized solution for +ve elements
        int arr[] = { 1 ,4 ,3 ,3 ,5 ,5};
        int k = 16;

        int i = 0;
        int j = 0;
        int sum = arr[0];
        int length=0;
        while (i < arr.length) {
            while(j<=i&&sum>k){
                sum=sum-arr[j];
                j++;
            }
            if(sum==k){
                length=Math.max(length,i-j+1);
            }
            i++;
            if(i<arr.length){
                sum=sum+arr[i];
            }
            
        }
        System.out.println(length);
    }
}
