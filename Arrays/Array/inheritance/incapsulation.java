class student {
  private int id;
  String name;
  int age;
}

class student1 extends student {

}

public class incapsulation {
  public static void main(String[] args) {
    student1 s1 = new student1();
    s1.id = 1;
  }
}
