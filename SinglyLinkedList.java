public class SinglyLinkedList {
    Node head;
    Node tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    private class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

     public void addFirst(String data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    public void addLast(String data) {
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
    public static void main(String[] args) {
        SinglyLinkedList list=new SinglyLinkedList();
        list.addFirst("Manal");
        list.addFirst("Bakhtawar");
        list.addFirst("Mariyam");
        list.addFirst("Mayur");
        list.addLast("Omaima");
        list.addLast("Araaf");
        System.out.println("Before Deleting");
        list.display();
        list.deleteFirst();
        list.deleteLast();
        System.out.println("After Deleting");
        list.display();
    }
}