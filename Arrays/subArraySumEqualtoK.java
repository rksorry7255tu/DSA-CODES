public class subArraySumEqualtoK {
    public static void main(String[] args) {
        //int nums[] = { 1, 1, 1 };
        int nums[]={1};
        int sum = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int k = 0;
        while (j < nums.length&&i<=j) {
            sum = sum + nums[j];
            if (sum == k) {
                count++;
            }
             if(sum<0){
                sum = sum - nums[i];
                i++;
                if (sum == k) {
                    count++;
                }
            }
            while (sum > k&&i<j) {
                sum = sum - nums[i];
                i++;
                if (sum == k) {
                    count++;
                }
            }
            j++;
        }
        System.out.println(count);
    }
}
