import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
        //merging with extra space
        int nums1[]={-1,0,0,3,3,3,0,0,0};
        int nums2[]={1,2,2};
        int m=6;
        int n=3;
        int j=0;
        int res[]=new int[n+m];
      
        for(int i=0;i<m;i++){
            res[j++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            res[j++]=nums2[i];
        }
        Arrays.sort(res);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        
    }
}
