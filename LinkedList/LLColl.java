import java.util.LinkedList;

public class LLColl {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.addFirst(1);
    list.addLast(2);
    list.add(0, 10);
    list.set(0, 11);
    list.remove();
    list.removeFirst();
    list.removeLast();
    System.out.println(list.get(0));
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    System.out.println(list.subList(0, 4));
    LinkedList reverse = list.reversed();
    System.out.println(reverse);
    System.out.println(list);
    for (int l : list) {
      System.out.println(l);
    }
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    System.out.println(list.size());
    String str = list.toString();
    System.out.println(str);

    System.out.println();
  }
}
