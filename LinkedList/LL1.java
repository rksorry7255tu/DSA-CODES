
public class LL1 {
  Node head;

  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  // add=first
  public void addFirst(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      System.out.println("Node is added");
      return;
    }
    newNode.next = head;
    head = newNode;
    System.out.println("Node is added");

  }

  // add-last
  public void addLast(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
    System.out.println("Node is added");
  }

  // print data
  public void printList() {
    if (head == null) {
      System.out.println("list is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "-->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  // delete-first
  public void deleteFirst() {
    if (head == null) {
      System.out.println("list is empty");
      return;
    }
    Node temp = head;
    head = head.next;
    temp.next = null;
    System.out.println("Node is deleted");
  }

  // delete-last
  public void deleteLast() {
    if (head == null) {
      System.out.println("list is empty");
      return;
    }
    Node prevNode = head;
    Node currNode = head;
    while (currNode.next != null) {
      prevNode = currNode;
      currNode = currNode.next;
    }
    prevNode.next = null;
    currNode = null;
    System.out.println("Node is deleted");
  }

  // size
  public int size() {
    int length = 0;
    if (head == null) {
      return 0;
    }
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      length++;
    }
    return length;
  }

  // reversing linked list
  public void reversed() {
    if (head == null || head.next == null) {

      return;
    }
    Node prevNode = head;
    Node currNode = head.next;
    while (currNode != null) {
      Node nextNode = currNode.next;
      currNode.next = prevNode;
      prevNode = currNode;
      currNode = nextNode;
    }
    head.next = null;
    head = prevNode;

  }

  public static void main(String arg[]) {
    LL1 list = new LL1();
    list.addFirst("first");
    list.addLast("last");
    list.addLast("last");
    list.reversed();

    list.printList();

  }

}
