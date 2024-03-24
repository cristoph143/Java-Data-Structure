
// HashTableOperations.java
import java.util.Hashtable;
import java.util.Scanner;

public class HashTableOperations implements DataStructureOperations {
  Hashtable<String, String> hashTable = new Hashtable<String, String>();
  private Scanner scanner;

  public HashTableOperations(Scanner scanner) {
    this.scanner = scanner;
  }

  public void insert() {
    System.out.print("Enter key to insert: ");
    String key = scanner.next();
    System.out.print("Enter value for the key: ");
    String value = scanner.next();
    hashTable.put(key, value);
    System.out.println("Inserted: [" + key + ": " + value + "]");
  }

  public void delete() {
    System.out.print("Enter key to delete: ");
    String key = scanner.next();
    if (hashTable.remove(key) != null) {
      System.out.println("Deleted key: " + key);
    } else {
      System.out.println("Key not found.");
    }
  }

  public void select() {
    System.out.print("Enter key to retrieve: ");
    String key = scanner.next();
    String value = hashTable.get(key);
    if (value != null) {
      System.out.println("Value: " + value);
    } else {
      System.out.println("Key not found.");
    }
  }

  public void find() {
    System.out.print("Enter key to find: ");
    String key = scanner.next();
    boolean exists = hashTable.containsKey(key);
    System.out.println("Key " + (exists ? "exists" : "does not exist") + " in the hash table.");
  }

  public void display() {
    System.out.println("Current Hash Table: " + hashTable);
  }
}