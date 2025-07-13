public class miniStation {
  public static void main(String[] args) {
    int k = 7;
    int a[] = { 100, 112, 256, 349, 770 };
    int b[] = { 72, 86, 113, 119, 265, 445, 892 };
    int i = 0;
    int j = 0;
    int count = 0;
    int ans = 0;
    while (i < a.length && j < b.length) {
      if (a[i] <= b[j]) {
        count++;
        if (count == k) {
          ans = a[i];
          break;
        }
        i++;
      } else {
        count++;
        if (count == k) {
          ans = a[i];
          break;
        }
        j++;
      }
    }
    System.out.println(ans);
  }
}