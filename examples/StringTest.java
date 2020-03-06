public class StringTest {
  public static void substringTest() {
    String text = "This is it";
    int index = text.indexOf("is");
    System.out.println("index: " + index);
    text = text.substring(index + 3);
    System.out.println("text: " + text);
  }

  public static void main(String[] args) {
    substringTest();
  }
}
