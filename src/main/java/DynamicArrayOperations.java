
// DynamicArrayOperations.java
import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayOperations implements DataStructureOperations {
  private ArrayList<Integer> dynamicArray = new ArrayList<Integer>();
  private Scanner scanner;

  public DynamicArrayOperations(Scanner scanner) {
    this.scanner = scanner;
  }

  public void insert() {
    System.out.print("Enter number to insert: ");
    int num = scanner.nextInt();
    dynamicArray.add(num);
    System.out.println("Inserted: " + num);
  }

  public void delete() {
    if (dynamicArray.isEmpty()) {
      System.out.println("Dynamic array is empty.");
    } else {
      System.out.print("Enter index to delete: ");
      int index = scanner.nextInt();
      if (index >= 0 && index < dynamicArray.size()) {
        int removed = dynamicArray.remove(index);
        System.out.println("Deleted: " + removed);
      } else {
        System.out.println("Invalid index.");
      }
    }
  }

  public void select() {
    System.out.println("Dynamic array contents:");
    for (int i = 0; i < dynamicArray.size(); i++) {
      System.out.println("Index " + i + ": " + dynamicArray.get(i));
    }
  }

  public void find() {
    System.out.print("Enter number to find: ");
    int num = scanner.nextInt();
    int index = dynamicArray.indexOf(num);
    if (index != -1) {
      System.out.println("Found at index: " + index);
    } else {
      System.out.println("Not found.");
    }
  }

  public void display() {
    System.out.println("Current Dynamic Array: " + dynamicArray);
  }
}
