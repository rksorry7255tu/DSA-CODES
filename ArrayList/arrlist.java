import java.util.ArrayList;
import java.util.Collections;

public class arrlist {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    System.out.println(list);

    list.add(0, 2);
    System.out.println(list);
    System.out.println(list.get(0));
    System.out.println(list.set(0, 0));
    list.remove(0);
    System.out.println(list);
    System.out.println(list.size());
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    list.add(10);
    list.add(1);
    list.add(2);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);

  }
}
