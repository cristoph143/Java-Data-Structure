
// ArrayOperations.java
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations implements DataStructureOperations {
  private int[] array = new int[10];
  private int size = 0;
  private Scanner scanner;

  public ArrayOperations(Scanner scanner) {
    this.scanner = scanner;
  }

  public void insert() {
    if (size >= array.length) {
      System.out.println("Array is full.");
    } else {
      System.out.print("Enter number to insert: ");
      int num = scanner.nextInt();
      array[size++] = num;
      System.out.println("Inserted: " + num);
    }
  }

  public void delete() {
    if (size == 0) {
      System.out.println("Array is empty.");
    } else {
      size--;
      System.out.println("Deleted: " + array[size]);
    }
  }

  public void select() {
    System.out.println("Array contents:");
    for (int i = 0; i < size; i++) {
      System.out.println("Index " + i + ": " + array[i]);
    }
  }

  public void find() {
    System.out.print("Enter number to find: ");
    int num = scanner.nextInt();
    for (int i = 0; i < size; i++) {
      if (array[i] == num) {
        System.out.println("Found at index: " + i);
        return;
      }
    }
    System.out.println("Not found.");
  }

  public void display() {
    System.out.println("Current Array: " + Arrays.toString(Arrays.copyOf(array, size)));
  }
}