class StringEqualityTest {
  public static void main(String[] args) {
    stringEquality();
  }

  public static void stringEquality() {
    String aString = "a literal string";
    String anEqualString = "a literal string";
    String aStringDifferentAtCompileTime = "    a literal string";
    String aStringNotInStringPool = new String("a literal string");
    System.out.println("Comparing strings in string pool: " + String.valueOf(aString == anEqualString));
    System.out.println("Comparing strings in string pool different at compile time: " + String.valueOf(aString == aStringDifferentAtCompileTime.trim()));
    System.out.println("Comparing strings not in string pool: " + String.valueOf(aString == aStringNotInStringPool));
  }
}

