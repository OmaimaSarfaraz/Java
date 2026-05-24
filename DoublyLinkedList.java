public class DoublyLinkedList{
    Node head;
    Node tail;
    int size;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Add First
    public void addfirst(int data){
        if (head == null) {
            Node temp = new Node(data, null, null);
            head = temp;
            tail = temp;
        } else {
            Node newnode = new Node(data, head, null);
            head.prev = newnode;
            head = newnode;
        }
        size++;
    }

    // Add Last
    public void addlast(int data){
        if (head == null) {
            addfirst(data);
        } else {
            Node newnode = new Node(data, null, tail);
            tail.next = newnode;
            tail = newnode;
        }
        size++;
    }

    // Delete First
    public void deletefirst(){
        if (head == null) {
            System.out.println("No List Exist");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    //Task 1 – Delete Last Node
    public void deletelast(){
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) { // only one node
            head = null;
            tail = null;
        } else {
            Node temp = tail.prev;
            temp.next = null;
            tail = temp;
        }
        size--;
    }

    // Display Forward
    public void display(){
        Node temp = head;
        if (head == null) {
            System.out.println("List Is Empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

    //Task 2 – Display Backward
    public void displayBackward(){
        Node temp = tail;
        if (tail == null) {
            System.out.println("List Is Empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.prev;
            }
            System.out.println("Null");
        }
    }

    // Node Class
    private class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    //Task 3 – Demonstration
    public static void main(String[] args){
        DoublyLinkedList marks = new DoublyLinkedList();

        System.out.println("Marks");
        marks.addfirst(100);
        marks.addfirst(90);
        marks.addfirst(70);
        marks.addlast(110);
        marks.addlast(120);

        System.out.println("Before Deletion (Forward Display):");
        marks.display();

        marks.deletelast();

        System.out.println("After Deleting Last Node (Forward Display):");
        marks.display();

        System.out.println("Displaying Backward:");
        marks.displayBackward();
    }
}