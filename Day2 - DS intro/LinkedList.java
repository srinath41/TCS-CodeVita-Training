class Node {

  int data;
  Node next;
}

public class LinkedList {

  Node head;

  public void insertBegin(int data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = head;
    head = newNode;
  }

  public void insertAt(int data, int position) {
    Node newNode = new Node();
    newNode.data = data;
    if (position == 0) {
      newNode.next = head;
      head = newNode;
    } else {
      Node currentNode = head;
      int currentPos = 0;
      while (currentNode != null && currentPos < position - 1) {
        currentNode = currentNode.next;
        currentPos++;
      }
      if (currentNode == null) {
        System.out.println("Position out of bounds");
        return;
      }
      newNode.next = currentNode.next;
      currentNode.next = newNode;
    }
  }

  public void insertEnd(int data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    if (head == null) {
      head = newNode;
    } else {
      Node lastNode = head;
      while (lastNode.next != null) {
        lastNode = lastNode.next;
      }
      lastNode.next = newNode;
    }
  }

  public void printList() {
    Node currentNode = head;
    while (currentNode != null) {
      System.out.print(currentNode.data + " ");
      currentNode = currentNode.next;
    }
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insertEnd(1);
    list.insertEnd(2);
    list.insertEnd(3);
    list.insertEnd(4);
    list.insertEnd(5);
    list.insertBegin(0);
    list.insertAt(6, 3);
    list.insertAt(7, 2);
    list.printList();
  }
}
