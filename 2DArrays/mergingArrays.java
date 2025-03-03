import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class mergingArrays {
  public static void main(String[] args) {
    // String s = "A man, a plan, a canal: Panama";
    String s = "0P";
    ArrayList<Character> list = new ArrayList<>();
    String S = s.toLowerCase();
    for (int i = 0; i < s.length(); i++) {
      int ascii = S.charAt(i);
      if ((ascii >= 97 && ascii <= 122) || (ascii >= 48 && ascii <= 57)) {
        list.add(S.charAt(i));
      }

    }

    boolean result = false;
    int last = list.size() - 1;
    System.out.println(list.size());
    if (list.size() == 0) {
      result = true;

    } else {
      for (int i = 0; i < list.size(); i++) {

        if (list.get(i) == list.get(last)) {
          result = true;
        } else if (list.get(i) != list.get(last)) {
          result = false;
          break;
        }
        last--;
      }
    }

    System.out.println(result);
  }

}
