public class LinkedList {
    //Task 1
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Task 2
    Node head;
    Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Task 3
    public void addFirst(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    public void addLast(int data) {
        Node temp = new Node(data);
        if (tail == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete!");
            return;
        }
        System.out.println("Deleting: " + head.data);
        head = head.next;

        if (head == null) {
            tail = null;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) { 
            System.out.println("Deleting: " + head.data);
            head = null;
            tail = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) { 
            temp = temp.next;
        }

        System.out.println("Deleting: " + temp.next.data);
        temp.next = null;
        tail = temp;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Task 4
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(50);
        list.addFirst(30);
        list.addFirst(10);
        list.addLast(100);

        System.out.println("Linked List:");
        list.display();

        list.deleteFirst();
        list.deleteLast();

        System.out.println("Linked List After Deleting:");
        list.display();
    }
}