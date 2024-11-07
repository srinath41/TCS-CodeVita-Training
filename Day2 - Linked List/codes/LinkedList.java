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

  public void deleteBegin() {
    head = head.next;
  }

  public void deleteEnd() {
    if (head.next == null) {
      head = null;
      return;
    }
    Node t = head;
    while (t.next.next != null) {
      t = t.next;
    }
    t.next = null;
  }

  public void deleteAt(int position) {
    Node currentNode = head;
    int pos = 0;
    while (currentNode != null && pos < position - 1) {
      currentNode = currentNode.next;
      pos++;
    }
    currentNode.next = currentNode.next.next;
  }

  public void search(int data) {
    Node t = head;
    int i = 0;
    while (t != null) {
      if (t.data == data) {
        System.out.println(
          "Element is present in the list at  position : " + i
        );
        return;
      }
      t = t.next;
      i++;
    }
    System.out.println("Element is not present in the list");
  }

  public void reverse() {
    Node prev = null;
    Node t = head;
    while (t != null) {
      Node next = t.next;
      t.next = prev;
      prev = t;
      t = next;
    }
    head = prev;
  }

  public void sort() {
    Node t = head;
    while (t != null) {
      Node i = t;
      while (i.next != null) {
        if (t.data > i.next.data) {
          int temp = t.data;
          t.data = i.next.data;
          i.next.data = temp;
        }
        i = i.next;
      }
      t = t.next;
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
    list.deleteBegin();
    list.deleteEnd();
    list.deleteAt(3);
    list.search(4);
    list.printList();
    System.out.println();
    list.reverse();
    list.printList();
    System.out.println();
    list.sort();
    list.printList();
  }
}
