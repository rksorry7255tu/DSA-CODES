public class twoSum {
    public static void main(String[] args) {
        //bruteforce solutions
        int nums[]={2,7,11,15};
        int target=9;
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++){
           
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
