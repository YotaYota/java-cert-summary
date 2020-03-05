class Parent {
  public void m() {
    System.out.println("Parent method");
  }
}

public class InheritanceTest extends Parent {
  void m(String s) { // overloaded method
    System.out.println("arg: " + s);
  }

  public static void main(String[] args) {
    // foo is of type Parent. If changed to InheritanceTest
    // the code will compile.
    Parent foo = new InheritanceTest();
    foo.m();
    //foo.m("Hello from main"); // COMPILE ERROR
  }
}

