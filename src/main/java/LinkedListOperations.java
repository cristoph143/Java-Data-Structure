
// LinkedListOperations.java
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListOperations implements DataStructureOperations {
  LinkedList<Integer> linkedList = new LinkedList<Integer>();
  private Scanner scanner;

  public LinkedListOperations(Scanner scanner) {
    this.scanner = scanner;
  }

  public void insert() {
    System.out.print("Enter number to insert at the end: ");
    int num = scanner.nextInt();
    linkedList.add(num);
    System.out.println("Inserted: " + num);
  }

  public void delete() {
    if (linkedList.isEmpty()) {
      System.out.println("Linked list is empty.");
    } else {
      System.out.print("Enter index to delete: ");
      int index = scanner.nextInt();
      if (index >= 0 && index < linkedList.size()) {
        int removed = linkedList.remove(index);
        System.out.println("Deleted: " + removed);
      } else {
        System.out.println("Invalid index.");
      }
    }
  }

  public void select() {
    System.out.println("Linked list contents:");
    int index = 0;
    for (int num : linkedList) {
      System.out.println("Index " + index++ + ": " + num);
    }
  }

  public void find() {
    System.out.print("Enter number to find: ");
    int num = scanner.nextInt();
    int index = linkedList.indexOf(num);
    if (index != -1) {
      System.out.println("Found at index: " + index);
    } else {
      System.out.println("Not found.");
    }
  }

  public void display() {
    System.out.println("Current Linked List: " + linkedList);
  }
}
