import java.util.Arrays;

public class mergeSortedArray1 {
    public static void main(String[] args) {
        //without using extra space
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        int m=3;
        int n=3;
        int j=0;
        for(int i=nums1.length-1;i>nums1.length-n-1;i--){
            nums1[i]=nums2[j++];
        }
        Arrays.sort(nums1);
        for(int i=0;i<nums1.length;i++){
            System.out.println(nums1[i]);
        }
    }
}
