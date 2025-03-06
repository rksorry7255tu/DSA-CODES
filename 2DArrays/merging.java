import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class merging {
  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 4, 5 };
    int b[] = { 1, 2, 3, 6, 7 };
    ArrayList<Integer> list = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();
    list.add(a[0]);
    set.add(a[0]);
    for (int i = 1; i < a.length; i++) {
      if (a[i] != a[i - 1]) {
        list.add(a[i]);
        set.add(a[i]);
      }
    }
    if (!set.contains(b[0])) {
      list.add(b[0]);
      set.add(b[0]);
    }
    for (int i = 1; i < b.length; i++) {
      if ((b[i] != b[i - 1]) && !set.contains(b[i])) {
        list.add(b[i]);
        set.add(b[0]);
      }
    }
    Collections.sort(list);
    System.out.println(list);
  }
}
