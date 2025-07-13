import java.util.ArrayList;

public class removeParenthesis {
  public static void main(String[] args) {
    // String s = "the sky is blue";
    String s = "  hello  world  ";

    int i = 0;
    int j = s.length() - 1;
    while (s.charAt(i) == ' ') {
      i++;
    }
    while (s.charAt(j) == ' ') {
      j--;
    }
    int end = j + 1;
    int start = j;
    String ans = "";
    while (j >= i) {
      if (s.charAt(j) == ' ') {
        start = j + 1;
        ans = ans + s.substring(start, end) + " ";

        while (s.charAt(j) == ' ') {
          j--;
        }
        end = j + 1;
      }
      if (j == i) {
        start = i;
        ans = ans + s.substring(start, end);
      }
      j--;
    }

    System.out.println(ans);
  }
}
