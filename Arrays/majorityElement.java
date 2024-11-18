import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        int result=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
            if(map.get(nums[i])>nums.length/2){
                result=nums[i];
            }
        }
        System.out.println(result);

    }
}
