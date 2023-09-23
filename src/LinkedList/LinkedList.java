package LinkedList;

public class LinkedList {
    private Node head;
    private int size;

    LinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void insertAtFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    public int getSize() {
        return size;
    }

    private void printList() {

        Node currentNode = head;
        while (currentNode != null) {

            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtFirst("11");
        list.insertAtFirst("21");
        list.insertAtFirst("229");
        list.printList();
        list.insertAtEnd("94");
        list.insertAtEnd("84");
        list.printList();
        list.deleteAtFirst();
        list.printList();
        list.deleteAtEnd();
        list.printList();
        System.out.println(list.getSize());
    }

}
