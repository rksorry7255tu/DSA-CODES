import java.util.ArrayList;
import java.util.HashMap;

public class friquency {
  public static void main(String[] args) {
    int arr[] = { 2, 1, 1 };
    HashMap<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (!map.containsKey(arr[i])) {
        map.put(arr[i], 0);

      }
      map.put(arr[i], map.get(arr[i]) + 1);

    }
    System.out.println(map);
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(i + 1)) {
        list.add(map.get(i + 1));
      } else {
        list.add(0);
      }
    }
    System.out.println(list);
  }
}
