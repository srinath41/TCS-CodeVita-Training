class Node {

  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class MergeLists {

  Node head;

  public void insertEnd(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = newNode;
  }

  public void mergeWith(MergeLists otherList) {
    if (head == null) {
      head = otherList.head;
      return;
    }
    Node last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = otherList.head;
  }

  public void sort() {
    if (head == null || head.next == null) return;

    for (Node i = head; i != null; i = i.next) {
      for (Node j = i.next; j != null; j = j.next) {
        if (i.data > j.data) {
          int temp = i.data;
          i.data = j.data;
          j.data = temp;
        }
      }
    }
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
    MergeLists l1 = new MergeLists();
    MergeLists l2 = new MergeLists();

    l1.insertEnd(3);
    l1.insertEnd(1);
    l1.insertEnd(7);

    l2.insertEnd(5);
    l2.insertEnd(2);
    l2.insertEnd(6);

    System.out.println("List 1:");
    l1.display();
    System.out.println("List 2:");
    l2.display();

    l1.mergeWith(l2);
    l1.sort();

    l1.display();
  }
}
