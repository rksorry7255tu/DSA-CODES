import java.util.HashMap;

public class longestSubarray {
    public static void main(String[] args) {
        int arr[]={15, -2, 2, -8, 1, 7, 10, 23};
        //int arr[]={-31, -48, -90, 54, 20, 95, 6, -86, 22};
        //int target=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==0){
                max=Math.max(max, i+1);
            }
            else{
                if(map.containsKey(sum)){
                    max=Math.max(max, i-map.get(sum));
                }else{
                    map.put(sum, i);
                }
            }
           // System.out.println(sum);
        }
        System.out.println(max);
    }
}
