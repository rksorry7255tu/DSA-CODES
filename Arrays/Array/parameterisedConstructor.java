
class student {
  String name;
  int age;

  student() {
  }

  student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  student(student s) {
  }
}

public class parameterisedConstructor {
  public static void main(String[] args) {
    student s = new student("Ravi", 19);
    student s1 = new student(s);
  }
}
