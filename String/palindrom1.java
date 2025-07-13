
import java.util.ArrayList;
import java.util.List;

public class palindrom1 {
  public static void main(String[] args) {
    int row = 5;
    int result = 1;
    List<List<Integer>> list = new ArrayList<>();
    for (int j = 1; j <= row; j++) {
      List<Integer> list1 = new ArrayList<>();
      for (int k = 1; k <= j; k++) {
        for (int i = 0; i < k - 1; i++) {
          result = result * (j - 1 - i);
          result = result / (i + 1);
        }

        list1.add(result);
        result = 1;
      }
      list.add(list1);
    }
    System.out.println(list);

    // for (int i = 0; i < col - 1; i++) {
    // result = result * (row - 1 - i);
    // result = result / (i + 1);
    // }
    // System.out.println(result);

  }
}
