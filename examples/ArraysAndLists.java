import static java.lang.System.out;
import java.util.*;
import java.util.List;

class ArraysAndLists {
  public static void main(String[] args) {
    compiles();
  }

  public static void compiles() {
    List<String> list = new ArrayList<>(List.of("A", "B"));
    String[] array1 = {"C"};
    String[] array2 = list.toArray(array1);
    array1[0] = "D";
    out.println(Arrays.toString(array2));
  }
}

