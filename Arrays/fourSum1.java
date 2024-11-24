import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class fourSum1 {
    public static void main(String[] args) {

        //time limit exceed
        int target = 0;
        //int[] uniqueNums = {-5,5,4,-3,0,0,4,-2};
        // int[] uniqueNums = {1,0,-1,0,-2,2};
        int[] nums = {1,0,-1,0,-2,2};
        Arrays.sort(nums);
        
        List<List<Integer>> listlist1=new ArrayList<>();

        if (nums.length >= 4) {
            List<List<Integer>> listlist = new ArrayList<>();
            int i = 0;
            int j = 1;
            int k = 2;
            int l = nums.length - 1;
            int sum = nums[i] + nums[j] + nums[k];
            while (k != nums.length - 1) {
                ArrayList<Integer> list = new ArrayList<>();
                sum = sum + nums[l];

                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                list.add(nums[l]);
                // System.out.println(nums[i] + " " + nums[j] + " " + nums[k] + " " + nums[l]);
                sum = sum - nums[l];
                l--;
                if (l == k) {
                    k++;
                    l = nums.length - 1;
                }
                if (l == k && k == nums.length - 1) {
                    j++;
                    k = j + 1;
                    l = nums.length - 1;
                }
                if (l == k && k == nums.length - 1 && j ==nums.length - 2) {
                    i++;
                    j = i + 1;
                    k = j + 1;
                    l = nums.length - 1;
                }
                int sum1 = 0;
                for (int m = 0; m < list.size(); m++) {
                    sum1 = sum1 + list.get(m);
                }
                if (sum1 == target && !listlist.contains(list)) {
                    
                    listlist.add(list);
                }
            }
            System.out.println(listlist);
        }
        else{
            System.out.println(listlist1);
        }
    }
 
}
