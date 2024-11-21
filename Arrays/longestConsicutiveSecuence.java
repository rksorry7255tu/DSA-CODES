import java.util.Arrays;

public class longestConsicutiveSecuence {
    public static void main(String[] args) {
        int nums[] = {9,1,4,7,3,-1,0,5,8,-1,6};
        int nums1[]=nums;
        Arrays.sort(nums);
        int i = 0;
        int count = 1;
        int max = 1;

        if (nums.length>0) {
            
            while (i < nums.length - 1) {
              
                if (nums[i] + 1 == nums[i + 1]) {
                    count++;
                    max = Math.max(max, count);
                }
                if (nums[i] > nums[i + 1]||nums[i] + 1 != nums[i + 1]) {
                    count = 1;
                    max=count;
                }
                i++;
            }
            System.out.println(max);
        }
        else {
            max=0;
            System.out.println(max);
        }

    }
}
