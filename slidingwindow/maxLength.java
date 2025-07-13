public class maxLength {
  public static void main(String[] args) {
    // int nums[] = { 0, 0, 0, 1 };
    // int k = 4;
    // int nums[] = { 0, 0, 1, 1 };
    // int k = 1;
    // int nums[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
    // int k = 2;
    int nums[] = { 1, 1, 0, 1 };
    int k = 1;
    int i = 0;
    int j = 0;
    int count = 0;
    int maxLength = 0;

    while (i <= j && i < nums.length && j < nums.length) {
      if (nums[j] == 0) {
        count++;
      }
      while (count > k) {
        if (nums[i] == 0) {
          count--;
        }
        i++;
      }
      maxLength = Math.max(maxLength, j - i + 1);
      j++;
    }

    System.out.println(maxLength);
    System.out.println(i + " " + j);
  }
}
