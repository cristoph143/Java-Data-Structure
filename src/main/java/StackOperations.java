
// StackOperations.java
import java.util.Stack;
import java.util.Scanner;

public class StackOperations implements DataStructureOperations {
  Stack<Integer> stack = new Stack<Integer>();
  private Scanner scanner;

  public StackOperations(Scanner scanner) {
    this.scanner = scanner;
  }

  public void insert() {
    System.out.print("Enter number to push: ");
    int num = scanner.nextInt();
    stack.push(num);
    System.out.println("Pushed: " + num);
  }

  public void delete() {
    if (stack.isEmpty()) {
      System.out.println("Stack is empty.");
    } else {
      System.out.println("Popped: " + stack.pop());
    }
  }

  public void select() {
    if (stack.isEmpty()) {
      System.out.println("Stack is empty.");
    } else {
      System.out.println("Top element: " + stack.peek());
    }
  }

  public void find() {
    System.out.println("Find operation is not typical for Stack.");
  }

  public void display() {
    System.out.println("Current Stack: " + stack);
  }
}
