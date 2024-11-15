import java.util.Arrays;

public class findMissing {
    public static void main(String[] args) {
        int nums[]={3,0,1};
        
        //Arrays.sort(nums);
        int res=0;
        int t=0;
        for(int x:nums){
            if(x==nums.length){
                t=x;
            }
        }
        if(t==nums.length){
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                res=i;
                break;
            }
        }}
        else{
            res=nums.length;
        }

        System.out.println(res);
    }
}
