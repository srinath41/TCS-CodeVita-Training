import java.util.Scanner;

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

public class problem091 {

  Node head;
  Node tail;

  public void insert(int x) {
    Node newNode = new Node(x);
    if (head == null) {
      head = tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
  }

  public void delete(int x) {
    Node temp = head;
    while (temp != null) {
      if (temp.data == x) {
        if (temp.prev != null) {
          temp.prev.next = temp.next;
        } else {
          head = temp.next;
        }
        if (temp.next != null) {
          temp.next.prev = temp.prev;
        } else {
          tail = temp.prev;
        }
      }
      temp = temp.next;
    }
  }

  public void display() {
    Node t = head;
    while (t != null) {
      System.out.print(t.data + " ");
      t = t.next;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    problem091 dll = new problem091();
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      dll.insert(a);
    }
    int e = sc.nextInt();
    dll.delete(e);
    dll.display();
    sc.close();
  }
}
