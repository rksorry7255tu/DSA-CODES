import java.util.Arrays;
import java.util.HashMap;

public class singleNumber {
    public static void main(String[] args) {
        int nums[]={2,2,1};
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=-1;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1 );
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                res=nums[i];
            }
        }
        System.out.println(res);
       
       
    }
}
