import java.util.Arrays;

public class maximumSubarray1 {
    public static void main(String[] args) {
        //int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // int nums[] = { 5,4,-1,7,8 };
        int nums[]={-2,-1};
       
        int sum =0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>max){
                max=Math.max(max, sum);
            }
           
            if(sum<0){
                sum=0;
            }

        }
        if(max==0){
            Arrays.sort(nums);
            max=nums[nums.length-1];
        }
        System.out.println(max);
       
        

    }
}
