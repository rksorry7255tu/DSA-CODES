public class jump {
  public static void main(String[] args) {
    int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
    int count = 0;
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        count = -1;
        break;
      }
      sum = sum + arr[i];
      count++;
      if (sum >= arr.length - 1) {
        break;
      }
    }
    System.out.println(count);

  }
}
