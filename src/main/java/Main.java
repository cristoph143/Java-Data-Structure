
// // import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;

// // import org.junit.jupiter.api.Test;
public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    DataStructures ds = new DataStructures(scanner);
    // Pass the scanner to the constructor
    ds.runMenu(); // runMenu should be called without arguments
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}