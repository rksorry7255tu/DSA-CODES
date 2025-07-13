public class LL {
  Node head;

  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  // add-first,last
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

    System.out.println("Node add at last");
  }

  // add-first
  public void addFirst(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
    System.out.println("Node is added");
  }

  // print list
  public void printListItems() {
    if (head == null) {
      System.out.println("Linkedlist is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "-->");
      temp = temp.next;
    }
    // System.out.print(temp.data + "-->");
    System.out.println("null");
  }

  // delete first
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
    Node currNode = head;
    Node prevNode = head;

    while (currNode.next != null) {
      prevNode = currNode;
      currNode = currNode.next;
    }
    prevNode.next = null;
    currNode = null;
    System.out.println("Node is deleted");

  }

  public int size() {
    int length = 0;
    if (head == null) {
      length = 0;
      System.out.println("list is empty");
      return 0;
    }
    Node temp = head;
    while (temp != null) {
      length++;
      temp = temp.next;
    }
    return length;
  }

  public static void main(String[] args) {
    LL list = new LL();
    // list.addFirst("first");
    // list.addLast("last");
    // list.addFirst("first");
    list.addLast("last");
    // list.printListItems();
    // list.deleteFirst();
    // list.printListItems();
    // list.deleteLast();
    list.printListItems();

    // System.out.println(list.size());
  }

}
