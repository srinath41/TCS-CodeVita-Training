class Node {

  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class DeleteDuplicateLL {

  Node head;

  public void insertEnd(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  public void removeDuplicates() {
    if (head == null) return;

    Node newHead = null;
    Node newTail = null;

    Node current = head;
    while (current != null) {
      if (!contains(newHead, current.data)) {
        Node newNode = new Node(current.data);
        if (newHead == null) {
          newHead = newNode;
          newTail = newNode;
        } else {
          newTail.next = newNode;
          newTail = newNode;
        }
      }
      current = current.next;
    }
    head = newHead;
  }

  private boolean contains(Node head, int data) {
    Node current = head;
    while (current != null) {
      if (current.data == data) return true;
      current = current.next;
    }
    return false;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    DeleteDuplicateLL ll = new DeleteDuplicateLL();
    ll.insertEnd(1);
    ll.insertEnd(2);
    ll.insertEnd(2);
    ll.insertEnd(3);
    ll.insertEnd(4);
    ll.insertEnd(4);
    ll.insertEnd(5);
    ll.insertEnd(1);
    ll.display();

    ll.removeDuplicates();

    ll.display();
  }
}
