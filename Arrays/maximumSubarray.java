public class maximumSubarray {
    public static void main(String[] args) {
        //int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        //brute force solutions
        int nums[]={5,4,-1,7,8};

        int max=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                max=Math.max(max, sum);
            }
            
        }
        System.out.println(max);
    }
}
