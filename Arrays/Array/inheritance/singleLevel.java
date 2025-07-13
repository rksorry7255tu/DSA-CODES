
class student {
  String name;
  int age;
}

class student1 extends student {
  String game;
}

class student2 extends student {
  String game;
}

class student3 extends student2 {

}

public class singleLevel {
  public static void main(String[] args) {
    student3 s = new student3();
    s.name = "Ravi";
    s.age = 20;
    s.game = "cricket";
    System.out.println(s.name);
    System.out.println(s.age);
    System.out.println(s.game);
  }
}
