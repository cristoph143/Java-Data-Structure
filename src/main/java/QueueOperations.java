
// QueueOperations.java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueOperations implements DataStructureOperations {
  Queue<Integer> queue = new LinkedList<Integer>();
  private Scanner scanner;

  public QueueOperations(Scanner scanner) {
    this.scanner = scanner;
  }

  public void insert() {
    System.out.print("Enter number to enqueue: ");
    int num = scanner.nextInt();
    queue.add(num);
    System.out.println("Enqueued: " + num);
  }

  public void delete() {
    if (queue.isEmpty()) {
      System.out.println("Queue is empty.");
    } else {
      System.out.println("Dequeued: " + queue.remove());
    }
  }

  public void select() {
    if (queue.isEmpty()) {
      System.out.println("Queue is empty.");
    } else {
      System.out.println("Front element: " + queue.peek());
    }
  }

  public void find() {
    System.out.println("Find operation is not typical for Queue.");
  }

  public void display() {
    System.out.println("Current Queue: " + queue);
  }
}
