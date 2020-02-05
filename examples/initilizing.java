class Initializer {
  public static void main(String[] args) {
    this.doesNotCompile();
  }

  public static void doesNotCompile() {
    int x;
    int y;
    x = 1, y = 1; // Cannot initialize multiple variables in the same statement
    System.out.println("x: " + x + ", y: " + y);
  }
}

