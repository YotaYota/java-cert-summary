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
    // return list as array with runtime type of array1
    String[] array2 = list.toArray(array1);
    array1[0] = "D";
    out.println(Arrays.toString(array2));
  }

  public static void notCompiles() {
    //int[] ints = new ints[];
  }
}

