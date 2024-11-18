import java.util.HashMap;

public class maxsubarray1 {
    public static void main(String[] args) {
         //int arr[] = { 10, 5, 2, 7, 1, 9 };
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 1, 4, 3, 3, 5, 5 };
        int k = 16;
        int sum = 0;
        int max = 0;
        map.put(0,-1);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            int diff=sum-k;
            if(map.containsKey(diff)){
                int length=i-map.get(diff);
                max=Math.max(max, length);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        System.out.println(max);
    }
}
