public class OrderOfInitTest {

  public OrderOfInitTest() {
    printThis("  Constructor call to static method");
    System.out.println("  Constructor!");
  }

  static void printThis (String string) {
    System.out.println(string);
  }

  static {
    printThis("1st static initializer");
  }

  {
    printThis("  1st instance initializer");
  }

  static {
    printThis("Calling constructor in static initializer:");
    new OrderOfInitTest();
  }

  {
    printThis("  2nd instance initializer");
  }

  static {
    printThis("2nd static initializer");
  }

  public static void main(String[] args) {
    System.out.println("In main method");
    printThis("main call to static method");
  }
}

