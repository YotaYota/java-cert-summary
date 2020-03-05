class OrderOfPrecedence {
  public static void main(String[] args) {
    orderOfPrecedence();
  }

  public static void orderOfPrecedence() {
    int i = 0;
    i += (i=10)*++i;
    System.out.println("i: " + i);
  }
}

