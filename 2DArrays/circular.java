public class circular {
  public static void main(String[] args) {
    int arr[] = { 0, 1, 0, 1, 0 };
    int k = 3;
    int arr1[] = new int[arr.length + k - 1];

    for (int i = 0; i < arr.length; i++) {

      arr1[i] = arr[i];

    }
    for (int i = 0; i < k - 1; i++) {
      arr1[arr.length + i] = arr[i];
    }
    int count = 0;
    for (int i = 0; i < arr1.length; i++) {
      for (int j = i + 1; j < k; j++) {
        if (arr[i] != arr[j]) {
          break;
        }
        count++;
      }
    }
    System.out.println(count);
  }
}
