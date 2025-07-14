import java.util.HashMap;
import java.util.HashSet;

public class maxFrouits {
  public static void main(String[] args) {
    // int arr[] = { 1, 2, 3, 2, 2 };
    // 4
    // int arr[] = { 1, 2, 1 };
    // 3
    // int arr[] = { 0, 1, 2, 2 };
    // 3
    // int arr[] = { 0 };
    // 1
    // int arr[] = {};
    // 0
    // int fruits[] = { 1, 1 };
    // 2
    // int fruits[] = { 14, 14, 1, 1, 14, 5, 14, 1, 14, 1, 5, 5, 1, 24, 7, 7, 8, 7,
    // 7, 12, 12, 8, 23, 8, 23, 8, 20, 10, 0,
    // 17 };
    // 5
    int fruits[] = { 1, 1, 0, 0, 1, 5, 5, 6 };
    HashMap<Integer, Integer> map = new HashMap<>();
    int i = 0;
    int j = 0;
    int maxLength = 0;
    while (j < fruits.length) {
      if (!map.containsKey(fruits[j])) {
        map.put(fruits[j], 1);
        j++;
      } else {
        map.put(fruits[j], map.get(fruits[j]) + 1);
        j++;
      }
      while (map.size() > 2 && i < fruits.length) {
        if (map.get(fruits[i]) > 1) {
          map.put(fruits[i], map.get(fruits[i]) - 1);
          i++;
        } else {
          map.remove(fruits[i]);
          i++;
        }
      }
      maxLength = Math.max(maxLength, j - i);
    }
    System.out.println(maxLength);
  }
}
