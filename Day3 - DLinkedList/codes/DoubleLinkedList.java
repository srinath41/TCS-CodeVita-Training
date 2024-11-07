class Node {

  int data;
  Node next;
  Node prev;

  Node(int data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}

public class DoubleLinkedList {

  Node head;
  Node tail;

  // Insert at the beginning
  public void insertBegin(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
    } else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
  }

  // Insert at the end
  public void insertEnd(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
  }

  // Insert at a specific position
  public void insertAt(int data, int position) {
    if (position < 0) {
      System.out.println("Position cannot be negative.");
      return;
    }

    Node newNode = new Node(data);
    if (position == 0) {
      insertBegin(data);
      return;
    }

    Node t = head;
    int pos = 0;
    while (t != null && pos < position - 1) {
      t = t.next;
      pos++;
    }

    // If position is out of bounds
    if (t == null) {
      System.out.println("Position out of bounds.");
      return;
    }

    // Insert newNode at the specified position
    newNode.next = t.next;
    if (t.next != null) {
      t.next.prev = newNode;
    } else {
      tail = newNode; // Update tail if inserted at the end
    }
    t.next = newNode;
    newNode.prev = t;
  }

  // Delete from the beginning
  public void deleteBegin() {
    if (head == null) {
      System.out.println("List is empty.");
      return;
    }
    if (head.next == null) {
      head = tail = null;
    } else {
      head = head.next;
      head.prev = null;
    }
  }

  // Delete from the end
  public void deleteEnd() {
    if (head == null) {
      System.out.println("List is empty.");
      return;
    }
    if (head.next == null) {
      head = tail = null;
    } else {
      tail = tail.prev;
      tail.next = null;
    }
  }

  // Delete at a specific position
  public void deleteAt(int position) {
    if (position < 0 || head == null) {
      System.out.println("Position out of bounds or list is empty.");
      return;
    }

    if (position == 0) {
      deleteBegin();
      return;
    }

    Node t = head;
    int pos = 0;
    while (t != null && pos < position) {
      t = t.next;
      pos++;
    }

    // If position is out of bounds
    if (t == null) {
      System.out.println("Position out of bounds.");
      return;
    }

    // Adjust pointers to remove the node
    if (t.prev != null) {
      t.prev.next = t.next;
    }
    if (t.next != null) {
      t.next.prev = t.prev;
    } else {
      tail = t.prev; // Update tail if deleting the last node
    }
  }

  // Display the list from head to tail
  public void displayForward() {
    Node currentNode = head;
    while (currentNode != null) {
      System.out.print(currentNode.data + " ");
      currentNode = currentNode.next;
    }
    System.out.println();
  }

  // Display the list from tail to head
  public void displayBackward() {
    Node currentNode = tail;
    while (currentNode != null) {
      System.out.print(currentNode.data + " ");
      currentNode = currentNode.prev;
    }
    System.out.println();
  }

  //count method
  public void count() {
    Node currentNode = head;
    int count = 0;
    while (currentNode != null) {
      count++;
      currentNode = currentNode.next;
    }
    System.out.println("Count: " + count);
  }

  //search method
  public void search(int key) {
    Node currentNode = head;
    int position = 0;
    while (currentNode != null) {
      if (currentNode.data == key) {
        System.out.println("Element found at position " + (position));
        return;
      }
      currentNode = currentNode.next;
      position++;
    }
  }

  public static void main(String[] args) {
    DoubleLinkedList dll = new DoubleLinkedList();

    dll.insertEnd(1);
    dll.insertEnd(2);
    dll.insertEnd(4);
    dll.displayForward(); // Output: 1 2 4

    dll.insertBegin(0);
    dll.displayForward(); // Output: 0 1 2 4

    dll.insertAt(3, 3);
    dll.displayForward(); // Output: 0 1 2 3 4
    dll.count();
    dll.search(3);
    dll.deleteAt(2);
    dll.displayForward(); // Output: 0 1 3 4

    dll.deleteBegin();
    dll.displayForward(); // Output: 1 3 4

    dll.deleteEnd();
    dll.displayForward(); // Output: 1 3

    dll.displayBackward(); // Output: 3 1
  }
}
