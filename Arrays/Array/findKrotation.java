import java.util.ArrayList;

public class findKrotation {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(0);
    list.add(1);
    list.add(2);
    list.add(3);

    int index = -1;
    int small = Integer.MAX_VALUE;
    int start = 0;
    int end = list.size() - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (list.get(mid) < small) {
        small = Math.min(small, list.get(mid));

      }
      index = mid;
      if (list.get(start) <= list.get(mid) && list.get(start) >= list.get(end)) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }

    }
    System.out.println(index);

  }
}
