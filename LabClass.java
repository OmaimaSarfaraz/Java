public class LabClass<AnydataType> {

    Node head;
    Node tail;
    int size;

    public LabClass() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Add element at start
    public void addfirst(AnydataType data) {
        Node temp = new Node(data, null);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    public void addLast(AnydataType data) {
        Node temp = new Node(data, null);
        if (tail == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    public void deleteFirst(){
        if (head == null) { 
        System.out.println("List is empty, nothing to delete!");
        return;
    }
    System.out.println("Deleting: " + head.data);
    head = head.next;

    size--;
}

    public void deleteLast(){
        if(head==null){
            System.out.println("List Is Empty");
        }
        else{
            Node temp=head;
            Node nextNode=temp.next;
            while(nextNode.next!=null){
                temp=nextNode;
                nextNode=nextNode.next;    
            }
            temp.next=null;
        }
        size--;
    }

    // Display function
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Inner Node class
    private class Node {
        AnydataType data;
        Node next;

        Node(AnydataType data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LabClass<String> list = new LabClass<>();
        
        list.addLast("NEXT");
        list.addfirst("Hello");
        list.addfirst("World");
        list.addfirst("Java");
        
         System.out.println("Linked List:");
        list.display();
        list.deleteFirst();
        list.deleteLast();
        System.out.println("Linked List After Deleting:");
        list.display();
    }
}