import java.util.HashSet;

public class longestSubstring {
  public static void main(String[] args) {
    String s = "abcabcbb";
    HashSet<Character> set = new HashSet<>();
    int i = 0;
    int j = 0;
    int largeSize = 0;
    while (i <= j && i < s.length() && j < s.length()) {
      if (!set.contains(s.charAt(j))) {
        set.add(s.charAt(j));
        j++;
        int size = j - i;
        largeSize = Math.max(largeSize, size);

      } else {
        int k = j - 1;
        int size = j - i;
        largeSize = Math.max(largeSize, size);
        i++;
        while (set.size() != 0 && k >= i) {
          set.remove(s.charAt(k));
          k--;
        }
        set.add(s.charAt(j));
        j++;
      }
    }
    System.out.println(largeSize);
    System.out.println(set);
  }
}
