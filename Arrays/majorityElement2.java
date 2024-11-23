import java.util.ArrayList;
import java.util.HashMap;

public class majorityElement2 {
    public static void main(String[] args) {
        int nums[]={1,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
                // if(map.get(nums[i])>nums.length/3){
                //     list.add(nums[i]);
                // }
            }
        }
        for (int i : map.keySet()) {
            if(map.get(i)>nums.length/3){
                 list.add(i);
             }
         }
         System.out.println(list);
    }
}
