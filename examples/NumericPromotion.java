class NumericPromotion {
  public static void main(String[] args) {
    compiles();
  }

  public static void compiles() {
    short x = 1;
    short y = 1;
    System.out.println("x: " + x + " y: " + y);
    short z = x*y; //DOES NOT COMPILE
  }
}

