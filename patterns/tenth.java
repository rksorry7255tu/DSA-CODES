
public class tenth {
  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      for (int k = 0; k < 6 - (2 * i); k++) {
        System.out.print("@");
      }
      for (int l = 0; l < i + 1; l++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4 - i; j++) {
        System.out.print("*");
      }
      for (int k = 2; k < (2 * (i + 1)); k++) {
        System.out.print("@");
      }
      for (int l = 0; l < 4 - i; l++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
