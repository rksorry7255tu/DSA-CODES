import java.util.Scanner;

public class string1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // String Declaration

    // System.out.println("enter userName");
    // String userName = sc.nextLine();
    // System.out.println(userName);

    // // concatenation
    // String firstname = "Ravi";
    // String lastname = "kumar";
    // String fullname = firstname + " " + lastname;
    // System.out.println(fullname);

    // // length
    // System.out.println(fullname.length());

    // // charAt
    // for (int i = 0; i < fullname.length(); i++) {
    // System.out.println(fullname.charAt(i));
    // }

    // compare
    String name1 = "Ravi";
    String name2 = "Savi";
    System.out.println(name1.compareTo(name2));
    System.out.println(name2.compareTo(name1));
    if (name1.compareTo(name2) == 0) {
      System.out.println("equal");
    } else {
      System.out.println("not equal");
    }

  }
}
