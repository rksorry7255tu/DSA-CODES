public class maxLength1 {
  public static void main(String[] args) {
    // int nums[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
    // int k = 2;
    // int nums[] = { 0, 0, 0, 1 };
    // int k = 4;
    // int nums[] = { 0, 0, 1, 1 };
    // int k = 1;
    int nums[] = { 1, 1, 0, 1 };
    int k = 1;
    int maxlength = 0;

    for (int i = 0; i < nums.length; i++) {
      int zero = 0;
      for (int j = i; j < nums.length; j++) {
        if (nums[j] == 0) {
          zero++;
        }
        if (zero <= k) {
          maxlength = Math.max(maxlength, j - i + 1);
        } else {
          break;
        }
      }
    }
    System.out.println(maxlength);
  }
}
