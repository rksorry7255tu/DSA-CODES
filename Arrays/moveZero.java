public class moveZero {
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        int res[]=new int[nums.length];
        int k=0;
       for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                res[k]=nums[i];
                k++;
            }
       }
       for(int i=0;i<res.length;i++){
        System.out.println(res[i]);
       }
    }
}
