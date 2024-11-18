import java.util.HashMap;

public class twoSum1 {
    public static void main(String[] args) {

        //optimization 
        int nums[]={2,7,11,15};
        int target=9;
        int arr[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                arr[0]=map.get(target-nums[i]);
                arr[1]=i;
            }
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i], i);
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
