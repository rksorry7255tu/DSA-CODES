public class array {
  public static void main(String[] args) {
    // int nums[] = { 1, 2, 2, 1, 1, 0 };
    int nums[] = { 847, 847, 0, 0, 0, 399, 416, 416, 879, 879, 206, 206, 206, 272 };
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        nums[i] = nums[i] * 2;
        nums[i + 1] = 0;
      }
    }

    // for (int i = 0; i < nums.length; i++) {
    // // if (nums[i] == 0) {
    // // int j = i;
    // // while (j < nums.length - 1) {
    // // nums[j] = nums[j + 1];
    // // j++;
    // // }
    // // nums[j] = 0;
    // }
    // }
    int arr[] = new int[nums.length];

    for (int i = 0, j = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        arr[j] = nums[i];
        j++;
      }
    }

    for (int k = 0; k < nums.length; k++) {
      System.out.println(arr[k]);
    }

  }
}
