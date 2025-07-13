import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;

public class largeString {
  public static void main(String[] args) {

    String s = "abcde";
    String goal = "cdeab";
    char arr[] = s.toCharArray();
    boolean res = false;
    HashSet<String> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      char last = arr[arr.length - 1];
      for (int j = arr.length - 1; j > 0; j--) {
        arr[j] = arr[j - 1];
      }
      arr[0] = last;
      String ans = new String(arr);
      set.add(ans);
    }
    if (set.contains(goal)) {
      res = true;
    }
    System.out.println(res);
  }

}