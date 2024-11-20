public class reArrangeArray1 {
    public static void main(String[] args) {
        int nums[]={28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        int res[]=new int[nums.length];
        int j=0;
        int k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                res[j]=nums[i];
                j=j+2;
            }
            if(nums[i]<0){
                res[k]=nums[i];
                k=k+2;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
