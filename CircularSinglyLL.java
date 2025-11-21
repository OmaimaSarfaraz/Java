public class CircularSinglyLL {
    Node head;
    Node tail;

    public CircularSinglyLL(){
        this.head = null;
        this.tail = null;
    }

    public void addfirst(int data){
        Node newnode = new Node(data, null);

        if(head == null){
            head = newnode;
            tail = newnode;
            tail.next = head;
        }
        else{
            newnode.next = head;
            head = newnode;
            tail.next = head;  
        }
    }

    public void addlast(int data){
        if(head == null){
            addfirst(data);
            return;
        }

        Node newnode = new Node(data, head);
        tail.next = newnode;
        tail = newnode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            System.out.println("First node deleted.");
            return;
        }

        head = head.next;
        tail.next = head;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            return;
        }

        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }

        temp.next = head;
        tail = temp;
    }

    public void display(){
        if(head == null){
            System.out.println("List is Empty....");
            return;
        }

        Node temp = head;

        do{
            System.out.print(temp.data + "-->");
            temp = temp.next;
        } while(temp != head);

        System.out.print("Return to head");
    }

    private class Node{
        int data;
        Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        CircularSinglyLL list = new CircularSinglyLL();
        
        list.addfirst(10);
        list.addfirst(11);
        list.addlast(9);
        list.addfirst(12);
        list.addlast(8);

        list.display();
        System.out.println();

        list.deleteFirst();
        list.deleteLast();

        System.out.println("After Deleting First and Last");
        list.display();
    }
}