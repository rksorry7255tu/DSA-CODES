
import java.util.*;

public class threesum {
  public static void main(String[] args) {
    int arr[] = { -1, 0, 1, 2, -1, -4 };
    List<List<Integer>> result = new ArrayList<>();
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    // HashSet<Integer> set = new HashSet<>();
    // for (int i : arr) {
    // set.add(i);
    // }
    // Integer arr1[] = set.toArray(new Integer[0]);
    for (int i = 0; i < arr.length - 2; i++) {
      for (int j = i + 1; j < arr.length - 1; j++) {
        for (int k = j + 1; k < arr.length; k++) {

          if (arr[i] + arr[j] + arr[k] == 0) {
            ArrayList<Integer> l1 = new ArrayList<>();
            l1.add(arr[i]);
            l1.add(arr[j]);
            l1.add(arr[k]);
            list.add(l1);
          }

        }
      }
    }
    result.addAll(list);
    System.out.println(result);

  }
}
