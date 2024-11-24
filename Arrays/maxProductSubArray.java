public class maxProductSubArray {
   public static void main(String[] args) {
    int nums[]={2,3,-2,4};
    //int nums[]={-2};
    int max=nums[0];
    for(int i=0;i<nums.length;i++){
        int product=1;
        for(int j=i;j<nums.length;j++){
            product=product*nums[j];
           // System.out.print(product+" ");
            max=Math.max(product, max);
        }
        System.out.println();
    }
    System.out.println(max);
   }
}
