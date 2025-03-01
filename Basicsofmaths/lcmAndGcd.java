public class lcmAndGcd {
  public static void main(String[] args) {
    int a = 1;
    int b = 1;
    int res[] = new int[2];
    int LCM = a;
    int iA = 1;
    int iB = 1;
    int lcmA = a;
    int lcmB = b;
    while (lcmA != lcmB) {
      if (lcmA < lcmB) {
        lcmA = a * iA;
        iA++;
      }
      if (lcmB < lcmA) {
        lcmB = b * iB;
        iB++;
      }
      if (lcmA == lcmB) {
        res[0] = LCM;
      }
    }

    int small = 1;
    int large = 1;
    if (a < b) {
      small = a;
      large = b;
    }
    int GCD = 1;
    int remainder = large % small;
    while (true) {
      if (remainder == 0) {
        GCD = remainder;
        res[1] = GCD;
      } else {
        large = small;
        small = remainder;
      }
    }

  }
}
