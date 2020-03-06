class OrderOfPrecedence {
  public static void main(String[] args) {
    orderOfPrecedence();
  }

  public static void orderOfPrecedence() {
    int i = 0;
    i += (i=10)*(++i);
    // Evaluation order first
    // i = i + (i=10)*++i
    //   = 0 + (10)*++i
    //   = 0 + (10)*11
    //   = 0 + 10 * 11
    // Now apply order of precedence
    //   = 110
    System.out.println("i: " + i);
  }
}

