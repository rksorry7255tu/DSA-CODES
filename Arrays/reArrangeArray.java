public class reArrangeArray {
    public static void main(String[] args) {
        //time complexities is more
        int nums[]={28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        int i=0;
        int j=0;
        while(i<nums.length){
            if(i%2==0&&nums[i]<0){
                j=i;
                while(nums[j]<0&&j<nums.length){
                    j++;
                }
                int temp=nums[j];
               int k=j;
               while(k>i){
                nums[k]=nums[k-1];
                k--;
               }
               nums[i]=temp;
            }
            if(i%2!=0&&nums[i]>=0){
                j=i;
                while(nums[j]>=0&&j<nums.length){
                    j++;
                }
                int temp=nums[j];
                int k=j;
                while(k>i){
                 nums[k]=nums[k-1];
                 k--;
                }
                nums[i]=temp;
            }
            i++;
        }
        
        
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]+" ");
        }
    }
}
