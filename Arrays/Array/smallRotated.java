public class smallRotated {
  public static void main(String[] args) {
    int nums[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
    int index = -1;
    int small = Integer.MAX_VALUE;
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (nums[mid] < small) {
        small = Math.min(small, nums[mid]);
        index = mid;
      }
      if (nums[start] <= nums[mid] && nums[start] >= nums[end]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }

    }
    System.out.println(index);
  }
}
