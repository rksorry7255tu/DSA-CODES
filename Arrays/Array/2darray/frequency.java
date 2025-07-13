import java.util.HashMap;

public class frequency {
  public static void main(String[] args) {
    String s = "Aabb";
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      if (!map.containsKey(s.charAt(i))) {
        map.put(s.charAt(i), 1);
      } else {
        map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
      }
    }
    int j = 0;
    int value[] = new int[map.size()];
    for (int i : map.values()) {
      value[j] = i;
      j++;
    }
    j = 0;
    char key[] = new char[map.size()];
    for (char c : map.keySet()) {
      key[j] = c;
      j++;
    }
    for (int i = 0; i < map.size(); i++) {
      for (int k = i + 1; k < map.size(); k++) {
        if (value[i] < value[k]) {
          int temp = value[i];
          value[i] = value[k];
          value[k] = temp;
          char temp1 = key[i];
          key[i] = key[k];
          key[k] = temp1;
        }
      }
    }
    String ans = "";
    for (int i = 0; i < map.size(); i++) {
      for (int k = 0; k < value[i]; k++) {
        ans = ans + key[i];
      }
    }
    System.out.println(ans);

  }
}
