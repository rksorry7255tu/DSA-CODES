import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {

        //int nums[] = { -1, 0, 1, 2, -1, -4 };
        int nums[]={-1,0,1,0};
        List<List<Integer>> setset=new ArrayList<>();
        int i = 0;
        int j = i + 1;
        int k = nums.length - 1;
        int sum = nums[i]+nums[k];

        while(k>=2){
            if(j==k){
                sum=sum-nums[k]+nums[k-1];
                k--;
                j=i+1;
            }
            
            sum=sum+nums[j];
           if(sum==0){
            List list = new ArrayList<>();
            HashSet<Integer> set=new HashSet<>();
            list.add(nums[i]);
            list.add(nums[j]);
            list.add(nums[k]);
            if(!setset.contains(list)){
                setset.add(list); 
            }  
            
           }
            sum=sum-nums[j];
            j++;
        }
       
        System.out.println(setset);
        













        // while (k >= 2) {
        //     sum=nums[i]+nums[k];
        //     if (j == k) {
        //         j = i + 1;
        //         sum=sum-nums[j]-nums[k];
        //         k--;
        //     }
        //     if ( sum+nums[j]==0 ) {
        //        System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
        //        sum=sum-nums[j];
        //     }
           
        //     j++;
        // }
    }
}
