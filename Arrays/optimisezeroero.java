import java.util.ArrayList;

public class optimisezeroero {
    public static void main(String[] args) {
        int nums[] = { 4, 2, 4, 0, 0, 3, 0, 5, 1, 0 };
        int res[]=new int[nums.length];
        int j=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            res[j]=nums[i];
            j++;
        }
       }
       for(int i=0;i<res.length;i++){
        nums[i]=res[i];
       }
        
      
       for(int i=0;i<res.length;i++){
        System.out.println(nums[i]);
       }
        
       
       
      

    }
}
