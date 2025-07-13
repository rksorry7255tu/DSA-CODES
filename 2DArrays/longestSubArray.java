import java.util.HashMap;

public class longestSubArray {
  public static void main(String[] args) {
    int arr[] = { 10, 5, 2, 7, 1, -10 };
    HashMap<Integer, Integer> map = new HashMap<>();
    int k = 15;
    int sum = 0;
    int max = 0;
    map.put(0, -1);
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
      int diff = sum - k;
      if (map.containsKey(diff)) {
        int length = i - map.get(diff);
        max = Math.max(max, length);
      }
      if (!map.containsKey(sum)) {
        map.put(sum, i);
      }
    }
    System.out.println(max);
  }
}
