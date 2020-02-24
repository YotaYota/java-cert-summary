import static java.lang.System.out;
import java.util.*;
import java.util.List;

class Switch {
  public static void main(String[] args) {
    String a = convert('a');
    String b = convert('b');
    out.println(a + " " + b);
  }

  public static String convert(char c) {
    String result;
    switch (c) {
      case 'a':
        result = "A";
      case 'b':
        result = "B";
        break;
      case 'c':
        result = "C";
    }
    return result; // DOES NOT COMPILE
  }
}

