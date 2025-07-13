class student {
  String name;
  int age;

  student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void inf(String name) {
    System.out.println(name);
  }

  void inf(int age) {
    System.out.println(age);
  }

  void inf(String name, int age) {
    System.out.println(name);
    System.out.println(age);
  }

  void inf(int age, String name) {
    System.out.println(age);
    System.out.println(name);
  }
}

public class overloading {
  public static void main(String[] args) {

  }
}
