package LinkedList;


public class LinkedList11 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtFirst(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                return;
            }
            //
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = temp;
        }

        void insertAtIndex(int index, int data) {
            Node newNode = new Node(data);
            Node temp = head;
            if(index==size())
            {
                insertAtEnd(data);
                return;
            }
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

          Node reverseList(Node head)
          {
              Node prev=null;
              Node curr=head;
              Node next=null;
              while(curr!=null) {
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
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtFirst(12);
        list.insertAtEnd(182);
        list.insertAtFirst(32);
        list.insertAtFirst(42);
        list.insertAtFirst(122);
        list.insertAtEnd(338);
        list.insertAtIndex(2, 334);
        list.display();
        System.out.println("========================REVERSE LIST====================");
        System.out.println(list.reverseList(new Node(12)));
        System.out.println("==========================");
        System.out.println(list.head.data);
        System.out.println(list.head.next.next.next.next.data);
        System.out.println(list.size());
    }
}
//