import java.util.Scanner;

public class DataStructures {
  private Scanner scanner;

  public DataStructures(Scanner scanner) {
    this.scanner = scanner;
  }

  public void runMenu() {
    while (true) {
      System.out.println("\nChoose data structure:");
      System.out.println("1: Array\n2: Dynamic Array\n3: Linked List\n4: Stack\n5: Queue\n6: Hash Table\n0: Exit");
      System.out.print("Enter your choice: ");
      int choice = this.scanner.nextInt();

      switch (choice) {
        case 1:
          showOperations(new ArrayOperations(this.scanner));
          break;
        case 2:
          showOperations(new DynamicArrayOperations(this.scanner));
          break;
        case 3:
          showOperations(new LinkedListOperations(this.scanner));
          break;
        case 4:
          showOperations(new StackOperations(this.scanner));
          break;
        case 5:
          showOperations(new QueueOperations(this.scanner));
          break;
        case 6:
          showOperations(new HashTableOperations(this.scanner));
          break;
        case 0:
          System.out.println("Exiting...");
          return;
        default:
          System.out.println("Invalid choice");
          break;
      }
    }
  }

  private void showOperations(DataStructureOperations operations) {
    while (true) {
      System.out.println("\nSelect operation:");
      System.out.println("1: Insert\n2: Delete\n3: Select\n4: Find\n5: Display Values\n0. Return to main menu");
      System.out.print("Enter your choice: ");
      int choice = this.scanner.nextInt();

      switch (choice) {
        case 1:
          operations.insert();
          break;
        case 2:
          operations.delete();
          break;
        case 3:
          operations.select();
          break;
        case 4:
          operations.find();
          break;
        case 5:
          operations.display();
          break;
        case 0:
          return;
        default:
          System.out.println("Invalid choice");
          break;
      }
    }
  }
}
