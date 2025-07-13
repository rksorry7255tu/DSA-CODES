import java.util.*;

public class product {
  public static void main(String[] args) {
    int nums[] = { 2, 4, 6, 8, 8, 8, 11, 13 };
    int target = 8;
    int first = -1;
    int last = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        if (first == -1)
          first = i; last=i;
        last = i;
      }
    }
    System.out.println(first);
    System.out.println(last);

  }
}
