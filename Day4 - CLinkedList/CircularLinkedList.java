class Node {

  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }
}

public class CircularLinkedList {

  Node head;
  Node tail; // New tail pointer for optimization

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
  }

  //insert at position
  public void insertAt(int data, int Position) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      newNode.next = head;
    } else {
      if (Position == 0) {
        newNode.next = head;
        tail.next = newNode;
        head = newNode;
      } else {
        Node current = head;
        for (int i = 0; i < Position - 1; i++) {
          current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
      }
    }
  }

  // Display the list
  public void display() {
    if (head == null) return;
    Node temp = head;
    do {
      System.out.print(temp.data + " ");
      temp = temp.next;
    } while (temp != head);
    System.out.println();
  }

  public static void main(String[] args) {
    CircularLinkedList cll = new CircularLinkedList();
    cll.insertBegin(0);
    cll.insertBegin(1);
    cll.insertBegin(2);
    cll.insertEnd(3);
    cll.insertAt(4, 2);
    cll.insertAt(6, 5);
    cll.display();
  }
}
