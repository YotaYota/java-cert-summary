import static java.lang.System.out;

class Initializer {
  public static void main(String[] args) {
    compiles();
    compilesAlso();
  }

  public static void compiles() {
    int x = 1, y = 1;
    // Cannot initialize multiple variables in the same statement, eg
    // x = 1, y = 1;
    out.println("x: " + x + ", y: " + y);
  }

  public static void compilesAlso() {
    int[] ints = new int[2];
    int[] intsTwo = new int[] {1, 2};
    int[] intsThree = {1, 2};
    out.println("ints: " + ints);
    out.println("intsTwo: " + intsTwo);
  }
}

