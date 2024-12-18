class Node {

  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }
}

public class CircularLinkedList {

  Node head;
  Node tail;
  int length = 0; // Length counter to track the number of nodes

  // Insert at the beginning
  public void insertBegin(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      newNode.next = head;
    } else {
      newNode.next = head;
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
      newNode.next = head;
    } else {
      tail.next = newNode;
      newNode.next = head;
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
      Node current = head;
      while (current.next != tail) {
        current = current.next;
      }
      current.next = head;
      tail = current;
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
    } else {
      Node current = head;
      for (int i = 0; i < position - 1; i++) {
        current = current.next;
      }
      current.next = current.next.next;

      // Update tail if the last element is deleted
      if (current.next == head) {
        tail = current;
      }
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

  // Reverse the circular linked list
  public void reverse() {
    if (head == null || head == tail) return;

    Node prev = tail;
    Node current = head;
    Node next;

    do {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    } while (current != head);

    // Swap head and tail, and restore circularity
    tail = head;
    head = prev;
    tail.next = head;
  }

  // Sort the list in ascending order
  public void sort() {
    if (head == null || head == tail) return;

    for (Node current = head; current.next != head; current = current.next) {
      for (Node index = current.next; index != head; index = index.next) {
        if (current.data > index.data) {
          // Swap data
          int temp = current.data;
          current.data = index.data;
          index.data = temp;
        }
      }
    }
  }

  // Display the circular linked list
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
    CircularLinkedList cll = new CircularLinkedList();
    cll.insertBegin(2);
    cll.insertBegin(1);
    cll.insertEnd(3);
    cll.insertAt(4, 3);
    cll.display(); // Should display 1 2 3 4

    cll.reverse();
    cll.display(); // Should display 4 3 2 1 (reversed order)

    cll.search(3); // Should print "Element found at index 1" (or the correct index)

    cll.deleteAt(1);
    cll.display(); // Should display 4 2 1 after deletion at index 1

    cll.sort();
    cll.display(); // Should display 1 2 4 in ascending order

    System.out.println("Length of list: " + cll.length); // Should print the length of the list
  }
}
