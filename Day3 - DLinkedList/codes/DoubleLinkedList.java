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

  public void insertAt(int data, int position) {
    Node newNode = new Node(data);
    Node t = head;
    int pos = 0;
    while (t != null && pos < position - 1) {
      t = t.next;
      pos++;
    }
    newNode.next = t.next;
    if (t.next != null) {
      t.next.prev = newNode;
    }
    t.next = newNode;
    newNode.prev = t;
  }

  // Delete from the beginning
  public void deleteBegin() {
    if (head == null) {
      System.out.println("List is empty");
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
      System.out.println("List is empty");
      return;
    }
    if (head.next == null) {
      head = tail = null;
    } else {
      tail = tail.prev;
      tail.next = null;
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

  public static void main(String[] args) {
    DoubleLinkedList dll = new DoubleLinkedList();

    dll.insertEnd(1);
    dll.insertEnd(2);
    dll.insertEnd(3);
    dll.displayForward(); // Output: 1 2 3

    dll.insertBegin(0);
    dll.displayForward(); // Output: 0 1 2 3

    dll.deleteBegin();
    dll.displayForward(); // Output: 1 2 3

    dll.deleteEnd();
    dll.displayForward(); // Output: 1 2

    dll.displayBackward(); // Output: 2 1
  }
}
