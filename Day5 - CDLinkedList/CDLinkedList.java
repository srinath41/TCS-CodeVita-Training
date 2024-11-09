class Node {

  int data;
  Node next;
  Node prev;

  Node(int data) {
    this.data = data;
  }
}

public class CDLinkedList {

  Node head;
  Node tail;
  int length = 0;

  // Insert at the beginning
  public void insertBegin(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      newNode.next = newNode.prev = newNode; // Point to itself to maintain circularity
    } else {
      newNode.next = head;
      newNode.prev = tail;
      head.prev = newNode;
      tail.next = newNode;
      head = newNode;
    }
    length++;
  }

  // Insert at the end
  public void insertEnd(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      newNode.next = newNode.prev = newNode; // Point to itself to maintain circularity
    } else {
      newNode.next = head;
      newNode.prev = tail;
      tail.next = newNode;
      head.prev = newNode;
      tail = newNode;
    }
    length++;
  }

  // Insert at a specific position
  public void insertAt(int data, int position) {
    if (position < 0 || position > length) {
      System.out.println("Invalid position");
      return;
    }

    if (position == 0) {
      insertBegin(data);
    } else if (position == length) {
      insertEnd(data);
    } else {
      Node newNode = new Node(data);
      Node current = head;
      for (int i = 0; i < position - 1; i++) {
        current = current.next;
      }
      newNode.next = current.next;
      newNode.prev = current;
      current.next.prev = newNode;
      current.next = newNode;
      length++;
    }
  }

  // Delete the first node
  public void deleteBegin() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    if (head == tail) {
      head = tail = null;
    } else {
      head = head.next;
      head.prev = tail;
      tail.next = head;
    }
    length--;
  }

  // Delete the last node
  public void deleteEnd() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    if (head == tail) {
      head = tail = null;
    } else {
      tail = tail.prev;
      tail.next = head;
      head.prev = tail;
    }
    length--;
  }

  // Delete a node at a specific position
  public void deleteAt(int position) {
    if (position < 0 || position >= length) {
      System.out.println("Invalid position");
      return;
    }
    if (position == 0) {
      deleteBegin();
    } else if (position == length - 1) {
      deleteEnd();
    } else {
      Node current = head;
      for (int i = 0; i < position; i++) {
        current = current.next;
      }
      current.prev.next = current.next;
      current.next.prev = current.prev;
      length--;
    }
  }

  // Search for an element
  public void search(int key) {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    Node current = head;
    int index = 0;
    do {
      if (current.data == key) {
        System.out.println("Element found at index " + index);
        return;
      }
      current = current.next;
      index++;
    } while (current != head);

    System.out.println("Element not found in the list");
  }

  // Reverse the circular doubly linked list
  public void reverse() {
    if (head == null || head == tail) return;

    Node current = head;
    Node temp;
    do {
      temp = current.next;
      current.next = current.prev;
      current.prev = temp;
      current = temp;
    } while (current != head);

    // Swap head and tail
    temp = head;
    head = tail;
    tail = temp;
  }

  // Sort the list in ascending order
  public void sort() {
    if (head == null || head == tail) return;

    for (Node current = head; current.next != head; current = current.next) {
      for (Node index = current.next; index != head; index = index.next) {
        if (current.data > index.data) {
          int temp = current.data;
          current.data = index.data;
          index.data = temp;
        }
      }
    }
  }

  // Display the circular doubly linked list
  public void display() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    Node temp = head;
    do {
      System.out.print(temp.data + " ");
      temp = temp.next;
    } while (temp != head);
    System.out.println();
  }

  public static void main(String[] args) {
    CDLinkedList cdll = new CDLinkedList();
    cdll.insertBegin(2);
    cdll.insertBegin(1);
    cdll.insertEnd(3);
    cdll.insertAt(4, 3);
    cdll.display(); // Should display 1 2 3 4

    cdll.reverse();
    cdll.display(); // Should display 4 3 2 1 (reversed order)

    cdll.search(3); // Should print "Element found at index 1" (or the correct index)

    cdll.deleteAt(1);
    cdll.display(); // Should display 4 2 1 after deletion at index 1

    cdll.sort();
    cdll.display(); // Should display 1 2 4 in ascending order

    System.out.println("Length of list: " + cdll.length); // Should print the length of the list
  }
}
