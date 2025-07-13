class one {
  void printOne() {
    System.out.println("one in one");
  }

}

class two extends one {
  void printOne() {
    System.out.println("one in two");
  }
}

public class overriding {
  public static void main(String[] args) {
    two two = new two();
    two.printOne();
  }
}
