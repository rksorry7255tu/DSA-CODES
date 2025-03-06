import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class hasing {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = nums.length - k; i < nums.length; i++) {
      list.add(nums[i]);
    }
    for (int i = 0; i < nums.length - k; i++) {
      list.add(nums[i]);
    }
    System.out.println(list);
    // list.toArray();
    int i = 0;
    for (Integer integer : list) {
      nums[i] = integer;
      i++;
    }

  }
}
