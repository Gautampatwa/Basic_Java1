package LinkedList;

class ReverseLinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();
        ll.head = new Node(12);
        ll.head.next = new Node(23);
        ll.head.next.next = new Node(37);
        ll.head.next.next.next = new Node(87);
        ll.head.next.next.next.next = new Node(74);
        ll.head.next.next.next.next.next = new Node(84);
        ll.display();
        head=ll.reverse(head);
        ll.display();
    }
}
